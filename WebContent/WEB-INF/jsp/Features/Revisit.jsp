<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="tech4ch.generator.MuseumGenerator"%>
<%@page import="tech4ch.pathfinding.*"%>
<%@ page import="java.util.*"%>
<%@page import="tech4ch.model.*"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="com.google.gson.JsonObject"%>
<body>
	<svg id="plane"></svg>
	<button onclick="move()">CLICK TO MOVE VISITOR</button>
	<form action="revisit">
		<input type="text" name="visitorIndex" /> 
		<br> 
		<input type="submit" value="Submit">
	</form>
</body>

<%
MuseumGenerator museumGenerator = new MuseumGenerator();
MuseumGenerator.initMuseum();
String index = request.getParameter("visitorIndex");
ArrayList<Position> visitor1path = MuseumGenerator.getVisitorPath(index); 

/*Take all positions for the visitor*/
ArrayList<ArrayList<Integer>> fin = new ArrayList<ArrayList<Integer>>();
for(Position p : visitor1path){
	ArrayList<Integer> fin2 = new ArrayList<Integer>();
	fin2.add(p.getX());
	fin2.add(p.getY());
	fin.add(fin2);
}
%>
<script>

var image = function(d){ return "url(#logo.png" + d + ")"; }

let positionMyPoint = <%=fin%>

let startPosition = [[20, 20]];

let i = 0;

d3.select("svg").append("defs")
.append("pattern")
.attr("id", "image")
.attr("height","100%")
.attr("width","100%")
.attr("cx", "100%")
.attr("cy","100%")
.attr("r","20")
.append("image")
.attr("cx", "100%")
.attr("cy","100%")
.attr("r","20")
.attr("viewBox", "0 0 200 200")
.attr("height","20")
.attr("width","20")
.attr("xlink:href","https://img.icons8.com/ios-filled/50/000000/captain-america.png")

// Add circles at the top
d3.select("#plane")
    .selectAll("myPoint")
    .data(startPosition)
    .enter()
    .append("circle")
    .attr("cx", function(d){return d[0]} )
    .attr("cy", function(d){return d[1]})
    .attr("r", "10")
    .attr("fill",  'url("#image")')
	.attr("stroke", "orange")
	.attr("stroke-width", 2)
    .attr("id", "point")
    .transition()


d3.select("#plane")
    .selectAll("points")
    .data(positionMyPoint)
    .enter()
    .append("circle")
    .attr("cx", function(d){return d[0]})
    .attr("cy", function(d){return d[1]})
    .attr("r", 5)
    .attr("fill", "yellow")
    .attr("stroke", "green")
    .attr("stroke-width", 2)

function move() {
    d3.select("#point")
        .transition()
        .duration(200)
        .attr("cx", positionMyPoint[i][0])
        .attr("cy", positionMyPoint[i][1]);
    i++;
}
</script>