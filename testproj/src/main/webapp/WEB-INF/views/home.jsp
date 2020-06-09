<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<script src="resources/js/fabric.js"></script>
<title>Home</title>
</head>
<body>

	<canvas id="canvas" width="400" height="400" style="border: 2px solid #000000">
    </canvas>
    <canvas id="canvas2" width="400" height="400" style="border: 2px solid #000000">
    </canvas>
	<div>
		<button id='circle'>circle</button>
		<button id='rect'>rect</button>
		<button id='tri'>tri</button>
		<button id='toJson'>toJson</button>
		
	</div>

</body>
<script
  src="https://code.jquery.com/jquery-3.5.1.js"
  integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
  crossorigin="anonymous"></script>
<script>
	var canvas = new fabric.Canvas('canvas');
	$("#circle").click(createCircle);
	$("#rect").click(createRect);
	$("#tri").click(createTriangle);
	$("#toJson").click(function() {
		
		console.log(canvas.toJSON());
		new fabric.Canvas('canvas2').loadFromJSON(canvas.toJSON());
	})
	
	function createCircle() {
		canvas.add(new fabric.Circle({
			radius:30,
			fill:'#f55',
			top:100,
			left:100
		}))
	}
	function createRect() {
		canvas.add(new fabric.Rect({
			width:20,
			height: 30,
			fill:'red',
			top:100,
			left:100			
		}));
	}
	function createTriangle() {
		canvas.add(new fabric.Triangle({
			width:20,
			height: 30,
			fill:'red',
			top:100,
			left:100	
		}));
	}
</script>

</html>
