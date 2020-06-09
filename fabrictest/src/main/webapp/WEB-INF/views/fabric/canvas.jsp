<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="/resources/js/fabric.js"></script>
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
		<button id='goCanvas'>goCanvas</button>
		<button id='toSVG'>toSVG</button>
	</div>
	<div>
		<p id="pJSON">	<c:out value="${json}" />
	</div>

	<form id="form" method="post">
		<input id="json" name="json" type="text">
	</form>

	<script src="https://code.jquery.com/jquery-3.5.1.js"
		integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
		crossorigin="anonymous"></script>
	<script>
		var canvas = new fabric.Canvas('canvas');
		var canvas2 = new fabric.Canvas('canvas2');
		
		$("#circle").click(createCircle);
		$("#rect").click(createRect);
		$("#tri").click(createTriangle);
		$("#toJson").click(function() {
			var $form = $("#form");
			var obJSON = canvas.toJSON();

			canvas2.loadFromJSON(obJSON);
			console.log(JSON.parse(JSON.stringify(obJSON)));

			$("#json").val(JSON.stringify(obJSON));

			$form.submit();

		})
		$("#goCanvas").click(function() {
			canvas2.loadFromJSON(JSON.parse($('#pJSON').text()))
			console.log("goCanvs")
			console.log();
			console.log(this);
		})
		$("#toSVG").click(function() {
			console.log(canvas2.toSVG());
			var url = canvas2.toSVG();
// 			var url = canvas2.toSVG();
// 			var xhr = new XMLHttpRequest();
// 			xhr.onreadystatechange = function() {
// 				var xmlDoc = canvas2.toSVG();
// 			}
// 			xhr.open("GET","BOOKS.xml", true)
// 			xhr.send();
			
// 			document.createElement('a').attr("href","url").click();
// 			console.log(typeof(canvas2.toSVG()))
// 			var $aTag =  $(document.createElement('a'));
// 			$aTag.download = "hello.xml";
			
// 			console.log($aTag.attr("href",url).get(0).click());
			
		});
		
		

		function createCircle() {
			canvas.add(new fabric.Circle({
				radius : 30,
				fill : '#f55',
				top : 100,
				left : 100
			}))
		}
		function createRect() {
			canvas.add(new fabric.Rect({
				width : 20,
				height : 30,
				fill : 'red',
				top : 100,
				left : 100
			}));
		}
		function createTriangle() {
			canvas.add(new fabric.Triangle({
				width : 20,
				height : 30,
				fill : 'red',
				top : 100,
				left : 100
			}));
		}
	</script>

</body>
</html>