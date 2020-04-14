<%@page import="tech4ch.generator.MuseumGenerator"%>
<%@ page import="java.util.*"%>
<%@ page import="tech4ch.model.Poi" %>
<%@page import="com.google.gson.Gson"%>
<%@page import="com.google.gson.JsonObject"%>

<br><br><br><br><br>
<div id='chartContainer'></div>

<%
	Gson gsonObj = new Gson();
Map<Object, Object> map = null;
MuseumGenerator museumGenerator = new MuseumGenerator();
MuseumGenerator.initMuseum();
List<Poi> poiList = MuseumGenerator.museumGetHoldingPowerStats();
List<Map<Object, Object>> list = new ArrayList<Map<Object, Object>>();
for(int i = 0; i < 15; i++){
	map = new HashMap<Object, Object>();
	map.put("label", poiList.get(i).getName());
	map.put("y", poiList.get(i).getTotalSeconds()/60);
	list.add(map);
}
String dataPoints = gsonObj.toJson(list);
%>

<script type="text/javascript">
	$(function() {
		var chart = new CanvasJS.Chart("chartContainer", {
			theme : "light2",
			animationEnabled : true,
			title : {
				text : "Best holding power POIs"
			},
			data : [ {
				fontsize : 10,
				type : "bar",
				dataPoints : <%out.print(dataPoints);%>
	} ]
		});
		chart.render();
	});
</script>