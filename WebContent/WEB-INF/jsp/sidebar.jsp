<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<div id="sidebar" class="sidebar-toggle">
	<ul class="nav nav-sidebar">
		<li><a href="/"> <i class="fa fa-home" aria-hidden="true"></i>
				<span>HOME</span>
		</a></li>
		<li role="separator" class="divider"></li>
		<!-- chart types -->
		<li data-toggle="collapse" href="#chart-types" aria-expanded="false"
			aria-controls="chart-types"><a href="#"> 
			<i class="fa fa-area-chart" aria-hidden="true"></i><span>MUSEUM CHARTS</span>
		</a></li>
		<li>
			<ul id="chart-types" class="sub-menu collapse ${fn:contains(pageContext.request.requestURI,'chart-types') ? 'in' : ''}">
				<li><a href="${pageContext.request.contextPath}/chart-types/attractionbar">Best attraction power POIs</a></li>
				<li><a href="${pageContext.request.contextPath}/chart-types/holdingbar">Best holding power POIs</a></li>
				<li><a href="${pageContext.request.contextPath}/chart-types/statsBar">General statistics POIs</a></li>
				<li><a href="${pageContext.request.contextPath}/chart-types/pieVisitors">Visitors in the museum</a></li>
				<li><a href="${pageContext.request.contextPath}/chart-types/bubbleVisitors">Visitors in rooms</a></li>
			</ul>
		</li>
		<!-- /chart types -->
		<li role="separator" class="divider"></li>
		<!--  features -->
		<li data-toggle="collapse" href="#features" aria-expanded="false"
			aria-controls="features"><a href="#"> <i class="fa fa-flask"
				aria-hidden="true"></i> <span>FEATURES</span>
		</a></li>
		<li>
			<ul id="features" class="sub-menu collapse ${fn:contains(pageContext.request.requestURI,'features') ? 'in' : ''}">
				<li><a href="${pageContext.request.contextPath}/revisit">Revisit a visit</a></li>
			</ul>
		</li>
		<!--  /features -->
		<li role="separator" class="divider"></li>
	</ul>
</div>