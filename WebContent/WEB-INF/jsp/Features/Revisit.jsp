<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<body id="demo">
	<svg  id="demo1">
	</svg>
</body>
<script>
var canvas = d3.select("svg");

var array = [400,300,120,140,160,200]


var posizioneVisitatori = {
    "visitor1":[
        canvas.append("circle")
            .attr("fill","green")
            .attr("cx",761)
            .attr("cy",463)
            .attr("r", 8)
            .transition()
            .duration(2000) //dura 2 secondi
            .delay(1000)    //parte dopo 2 secondi
            .attr("cx","506")
            .attr("cy","458")
            .attr("stroke","yellow")
            .attr("stroke-width","4")
            .transition()
            .attr("cx","497")
            .attr("cy","121")
            .transition()
            .attr("cx","189")
            .attr("cy","145")
           	.transition()
    ]
 
}
</script>

<script>
let svg = document.querySelector('svg')

function clicked(event) {
  let m = oMousePosSVG(event);
    console.log(m.x,m.y);
}

svg.addEventListener("click", clicked)


function oMousePosSVG(e) {
      var p = svg.createSVGPoint();
      p.x = e.clientX;
      p.y = e.clientY;
      var ctm = svg.getScreenCTM().inverse();
      var p =  p.matrixTransform(ctm);
      return p;
}
</script>