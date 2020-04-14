<%@page import="tech4ch.generator.MuseumGenerator"%>
<%@ page import="java.util.*"%>
<%@ page import="tech4ch.model.Visitor"%>
<%@ page import="tech4ch.model.Room"%>
<%@ page import="tech4ch.model.Poi"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="com.google.gson.JsonObject"%>
<br><br><br>
<div id='chartContainer' style="width: 120%; height:300px;padding-top:15px"></div>
<br></br>
<br></br>
<div id='1' style="width: 120%; height:300px;"></div>
<br></br>
<br></br>
<div id='2' style="width: 120%; height:300px;"></div>
<br></br>
<br></br>
<div id='3' style="width: 120%; height:300px;"></div>
<br></br>
<br></br>
<div id='4' style="width: 120%; height:300px;"></div>
<%
Gson gsonObj = new Gson();
Map<Object,Object> map = null;
List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
MuseumGenerator museumGenerator = new MuseumGenerator();
MuseumGenerator.initMuseum();
List<Poi> poiList = MuseumGenerator.museumGetPoiStats();

for(int i = 0; i < 10; i++){
	map = new HashMap<Object, Object>();
	map.put("label", poiList.get(i).getName());
	map.put("y",poiList.get(i).getTotalVisitors());
	list.add(map);
}

String dataPoints1 = gsonObj.toJson(list);
list = new ArrayList<Map<Object,Object>>();

for(int i = 0; i < 10; i++){
	map = new HashMap<Object, Object>();
	map.put("label", poiList.get(i).getName());
	map.put("y",poiList.get(i).getTotalSeconds()/60);
	list.add(map);
}
String dataPoints2 = gsonObj.toJson(list);
list = new ArrayList<Map<Object,Object>>();

for(int i = 10; i < 20; i++){
	map = new HashMap<Object, Object>();
	map.put("label", poiList.get(i).getName());
	map.put("y",poiList.get(i).getTotalVisitors());
	list.add(map);
}

String dataPoints3 = gsonObj.toJson(list);
list = new ArrayList<Map<Object,Object>>();

for(int i = 10; i < 20; i++){
	map = new HashMap<Object, Object>();
	map.put("label", poiList.get(i).getName());
	map.put("y",poiList.get(i).getTotalSeconds()/60);
	list.add(map);
}
String dataPoints4 = gsonObj.toJson(list);
list = new ArrayList<Map<Object,Object>>();

for(int i = 20; i < 30; i++){
	map = new HashMap<Object, Object>();
	map.put("label", poiList.get(i).getName());
	map.put("y",poiList.get(i).getTotalVisitors());
	list.add(map);
}

String dataPoints5 = gsonObj.toJson(list);
list = new ArrayList<Map<Object,Object>>();

for(int i = 20; i < 30; i++){
	map = new HashMap<Object, Object>();
	map.put("label", poiList.get(i).getName());
	map.put("y",poiList.get(i).getTotalSeconds()/60);
	list.add(map);
}
String dataPoints6 = gsonObj.toJson(list);
list = new ArrayList<Map<Object,Object>>();

for(int i = 30; i < 40; i++){
	map = new HashMap<Object, Object>();
	map.put("label", poiList.get(i).getName());
	map.put("y",poiList.get(i).getTotalVisitors());
	list.add(map);
}

String dataPoints7 = gsonObj.toJson(list);
list = new ArrayList<Map<Object,Object>>();

for(int i = 30; i < 40; i++){
	map = new HashMap<Object, Object>();
	map.put("label", poiList.get(i).getName());
	map.put("y",poiList.get(i).getTotalSeconds()/60);
	list.add(map);
}
String dataPoints8 = gsonObj.toJson(list);
list = new ArrayList<Map<Object,Object>>();

for(int i = 40; i < 52; i++){
	map = new HashMap<Object, Object>();
	map.put("label", poiList.get(i).getName());
	map.put("y",poiList.get(i).getTotalVisitors());
	list.add(map);
}

String dataPoints9 = gsonObj.toJson(list);
list = new ArrayList<Map<Object,Object>>();

for(int i = 40; i < 52; i++){
	map = new HashMap<Object, Object>();
	map.put("label", poiList.get(i).getName());
	map.put("y",poiList.get(i).getTotalSeconds()/60);
	list.add(map);
}
String dataPoints10 = gsonObj.toJson(list);
list = new ArrayList<Map<Object,Object>>();
%>

<script type="text/javascript">

   $(function () {
       var chart = new CanvasJS.Chart("chartContainer", {
           animationEnabled: true,
           title: {
               text: "General POIs statistics"
           },
           data: [
           {
               type: "stackedColumn",
               legendText: "Visitors",
               showInLegend: "true",
               dataPoints: <%out.print(dataPoints1);%>
           }, 
           {
               type: "stackedColumn",
               legendText: "Minutes",
               showInLegend: "true",
               indexLabelPlacement: "outside",
               dataPoints: <%out.print(dataPoints2);%>
           }
           ]
       });
       
       var chart1 = new CanvasJS.Chart("1", {
           animationEnabled: true,
           data: [
           {
               type: "stackedColumn",
               legendText: "Visitors",
               showInLegend: "true",
               dataPoints: <%out.print(dataPoints3);%>
           }, 
           {
               type: "stackedColumn",
               legendText: "Minutes",
               showInLegend: "true",
               indexLabelPlacement: "outside",
               dataPoints: <%out.print(dataPoints4);%>
           }
           ]
       });
       
       var chart2 = new CanvasJS.Chart("2", {
           animationEnabled: true,
           data: [
           {
               type: "stackedColumn",
               legendText: "Visitors",
               showInLegend: "true",
               dataPoints: <%out.print(dataPoints5);%>
           }, 
           {
               type: "stackedColumn",
               legendText: "Minutes",
               showInLegend: "true",
               indexLabelPlacement: "outside",
               dataPoints: <%out.print(dataPoints6);%>
           }
           ]
       });
       
       var chart3 = new CanvasJS.Chart("3", {
           animationEnabled: true,
           data: [
           {
               type: "stackedColumn",
               legendText: "Visitors",
               showInLegend: "true",
               dataPoints: <%out.print(dataPoints7);%>
           }, 
           {
               type: "stackedColumn",
               legendText: "Minutes",
               showInLegend: "true",
               indexLabelPlacement: "outside",
               dataPoints: <%out.print(dataPoints8);%>
           }
           ]
       });
       
       var chart4 = new CanvasJS.Chart("4", {
           animationEnabled: true,
           data: [
           {
               type: "stackedColumn",
               legendText: "Visitors",
               showInLegend: "true",
               dataPoints: <%out.print(dataPoints9);%>
           }, 
           {
               type: "stackedColumn",
               legendText: "Minutes",
               showInLegend: "true",
               indexLabelPlacement: "outside",
               dataPoints: <%out.print(dataPoints10);%>
           }
           ]
       });
       
       chart.render();
       chart1.render();
       chart2.render();
       chart3.render();
       chart4.render();
   });
</script>