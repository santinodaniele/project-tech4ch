<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<img src="resources/images/museum.jpg" style="width:135%; height:135%;padding-top:50px"/>

<div><img src="resources/images/1.gif" id="mainImage" name="mainImage" width="100%" height="100%" alt=""></div>


<script type="text/javascript">

    var currentIndex = 1;

    
    var maxIndex=5;

    function swapImage(imageIndex){
        //Check if we are at the last image already, return if we are.
        if(imageIndex>maxIndex){
            currentIndex=maxIndex;
            return;
        }

        //Check if we are at the first image already, return if we are.
        if(imageIndex<1){
            currentIndex=1;
            return;
        }

        currentIndex=imageIndex;
        //Otherwise update mainImage
        document.getElementById("mainImage").src='Slide' +  currentIndex  + '.gif';
        return;
    }
</script>