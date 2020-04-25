<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="tech4ch.generator.MuseumGenerator"%>
<%@page import="tech4ch.pathfinding.*"%>
<%@ page import="java.util.*"%>
<%@page import="tech4ch.model.*"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="com.google.gson.JsonObject"%>
<body>	
        <svg id="plane"></svg> 
        <h4><button onclick="move()">CLICK TO MOVE VISITOR</button> </h4>
        
</body>

<%
MuseumGenerator museumGenerator = new MuseumGenerator();
MuseumGenerator.initMuseum();
ArrayList<Position> visitor1path = MuseumGenerator.getVisitorPath(2); 

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

let positionMyPoint = <%=fin%>

let startPosition = [[20, 20]];

let i = 0;

// Add circles at the top
d3.select("#plane")
    .selectAll("myPoint")
    .data(startPosition)
    .enter()
    .append("circle")
    .attr("cx", function(d){return d[0]} )
    .attr("cy", function(d){return d[1]})
    .attr("r", 10)
    .attr("fill", "red")
	.attr("stroke", "orange")
	.attr("stroke-width", 3)
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
    .attr("stroke-width", 3)

function move() {
    d3.select("#point")
        .transition()
        .duration(200)
        .attr("cx", positionMyPoint[i][0])
        .attr("cy", positionMyPoint[i][1]);
    i++;
}
</script>