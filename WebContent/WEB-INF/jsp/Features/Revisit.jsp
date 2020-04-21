<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script>
var canvas = d3.select("body").append("svg");

var array = [400,300,120,140,160,200]

var posizioneVisitatori = {
    "visitor1":[
        canvas.append("circle")
            .attr("fill","red")
            .attr("cx",50)
            .attr("cy",50)
            .attr("r",10)
            .transition()
            .duration(2000) //dura 2 secondi
            .delay(1000)    //parte dopo 2 secondi
            .attr("cx", function(d){return array.shift();})
            .attr("cy",function(d){return array.shift()+1})
            .attr("stroke","yellow")
            .attr("stroke-width","3")
            .transition()
            .attr("cx","300")
            .attr("cy","200")
            .transition()
            .attr("cx","100")
            .attr("cy","200")
            .transition()
            .attr("cx","50")
            .attr("cy","50")
    ],
"visitor2":[
    canvas.append("circle")
        .attr("fill","yellow")
        .attr("cx",100)
        .attr("cy",100)
        .attr("r",10)
        .transition()
        .duration(2000) //dura 2 secondi
        .delay(1000)    //parte dopo 2 secondi
        .attr("cx", function(d){return array.shift();})
        .attr("cy",function(d){return array.shift()+1})
        .attr("stroke","red")
        .attr("stroke-width","3")
        .transition()
        .attr("cx","200")
        .attr("cy","200")
        .transition()
        .attr("cx","400")
        .attr("cy","200")
        .transition()
        .attr("cx","50")
        .attr("cy","50")
    ],

    "visitor3":[
        canvas.append("rect")
            .attr("x",100)
            .attr("y",20)
            .attr("width",20)
            .attr("height",20)
            .attr("fill","orange")
            .transition()
            .delay(1000)
            .duration(2000)
            .attr("stroke","red")
            .attr("stroke-width","3")
            .attr("x","600")
            .attr("y","300")
            .transition()
            .attr("x","300")
            .attr("y","300")
            .transition()
            .attr("x","600")
            .attr("y","300")
            .transition()
            .attr("x","50")
            .attr("y","50")
    ],
    "visitor4":[
        canvas.append("circle")
            .attr("fill","blue")
            .attr("cx","80")
            .attr("cy","90")
            .attr("r",10)
            .transition()
            .duration(2000) //dura 2 secondi
            .delay(1000)    //parte dopo 2 secondi
            .attr("cx", "50")
            .attr("cy","60")
            .attr("stroke","pink")
            .attr("stroke-width","3")
            .transition()
            .attr("cx","72")
            .attr("cy","50")
            .transition()
            .attr("cx","86")
            .attr("cy","47")
            .transition()
            .attr("cx","34")
            .attr("cy","22")
        ],
   
}
</script>