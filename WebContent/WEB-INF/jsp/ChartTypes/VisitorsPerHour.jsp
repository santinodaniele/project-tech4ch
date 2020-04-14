<%@page import="tech4ch.generator.MuseumGenerator"%>
<%@ page import="java.util.*"%>
<%@ page import="tech4ch.model.Visitor"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="com.google.gson.JsonObject"%>

<br><br><br><br><br>
<div id='chartContainer'></div>

<%
Gson gsonObj = new Gson();
Map<Object,Object> map = null;
List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
MuseumGenerator museumGenerator = new MuseumGenerator();
MuseumGenerator.initMuseum();
TreeMap <Integer,Integer> visitorsPerHour = MuseumGenerator.museumGetVisitorPerAllHours();

for(Integer hour : visitorsPerHour.keySet()){
	map = new HashMap<Object, Object>();
	map.put("y", visitorsPerHour.get(hour));
	map.put("legendText", "Time slot: " + hour + "-" + (hour+1));
	map.put("label", hour + "-" + (hour+1));
	list.add(map);
}

String dataPoints = gsonObj.toJson(list);
%>

<script type="text/javascript">
   $(function () {
       var chart = new CanvasJS.Chart("chartContainer", {
           title: {
               text: "Visitors per hour in the museum"
           },
           legend: {
               verticalAlign: "center",
               horizontalAlign: "left",
               fontSize: 20,
               fontFamily: "Helvetica"
           },
           animationEnabled: true,
           theme: "light2",
           data: [
           {
               type: "pie",
               indexLabelFontFamily: "Garamond",
               indexLabelFontSize: 20,
               indexLabel: "Time slot: {label}",
               startAngle: -20,
               showInLegend: true,
               toolTipContent: "{y} visitatori",
               dataPoints: <%out.print(dataPoints);%>              
           }
           ]
       });
       chart.render();
   });
</script>