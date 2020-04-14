<%@page import="tech4ch.generator.MuseumGenerator"%>
<%@ page import="java.util.*"%>
<%@ page import="tech4ch.model.Visitor"%>
<%@ page import="tech4ch.model.Room"%>
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

List<Room> roomList = MuseumGenerator.museumGetVisitorsPerRoom();

for (Room r : roomList){
	TreeMap <Integer, Integer> hourToVisitors = r.getHour2visitor();
	for(Integer hour : hourToVisitors.keySet() ){
		map = new HashMap<Object, Object>();
		map.put("x", hour);
		map.put("y", r.getRoomNumber());
		map.put("z", hourToVisitors.get(hour));
		map.put("Name", "Room:" + r.getRoomNumber());
		list.add(map);
	}
}

String dataPoints = gsonObj.toJson(list);
%>

<script type="text/javascript">

   $(function () {
       var chart = new CanvasJS.Chart("chartContainer", {
           zoomEnabled: true,
           animationEnabled: true,
           title: {
               text: "Visitors per hour per room",
               fontFamily: "Garamond"
           },
           
           axisX: {
               title: "Time slot",
               minimum: 9,
               maximum: 18
           },
           axisY: {
               title: "Room"
           },
           data: [
           {
               type: "bubble",
               toolTipContent: "<span style='\"'color: {color};'\"'><strong>{name}</strong></span><br/><strong>Time slot</strong> {x}<br/> <strong>Room</strong> {y}<br/> <strong>Visitors</strong> {z}",
               dataPoints: <%out.print(dataPoints);%>
           }
           ]
       });

       chart.render();
   });
</script>