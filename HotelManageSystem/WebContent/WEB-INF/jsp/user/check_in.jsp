<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="keywords" content="Elite Hotel Booking Widget Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- font files -->

<!-- //font files -->
<!-- css files -->
<link href="${pageContext.request.contextPath}/css/wickedpicker.css" rel="stylesheet" type="text/css" media="all">   
<link href="${pageContext.request.contextPath}/css/bootstrap_ci.css" rel='stylesheet' type='text/css' media="all">
<link href="${pageContext.request.contextPath}/css/style_ci.css" rel="stylesheet" type="text/css" media="all">
<!-- /css files -->
<!-- js files -->
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/move-top.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- /js files -->		

<script type="text/javascript">
	function getRoom(){
		$.post("${pageContext.request.contextPath}/hotel/getRoomId.do",{
			"type" : $('#roomType').val
		},function(data){
			$('#hidden_id').val(data);
		},"json");
	}
</script>

</head>
<body>
	
<div class="header">
	<h1>住宿登记</h1>
</div>

        <div class="banner-top">
				<!--<h2>Book Your Room Today</h2>-->
				<div class="banner-bottom">
					<form action="#" method="post">
					
					<input type="hidden" name="" id="hidden_id" />
					
					<div class="bnr-one">
						<div class="bnr-left">
							<p>用户姓名</p>
						</div>
						<div class="bnr-right">
							<input class="form-control"  type="text">
						</div>
						<div class="clearfix"></div>
					</div>
					
					<div class="bnr-one">
						<div class="bnr-left">
							<p>证件号码</p>
						</div>
						<div class="bnr-right">
							<input class="form-control"  type="text" >
						</div>
						<div class="clearfix"></div>
					</div>
					
					<div class="bnr-one">
						<div class="bnr-left">
							<p>入住日期</p>
						</div>
						<div class="bnr-right">
							<input class="date" id="datepicker" type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}" required=>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="bnr-one">
						<div class="bnr-left">
							<p>离店日期</p>
						</div>
						<div class="bnr-right">
							<input class="date" id="datepicker1" type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}" required=>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="bnr-one">
						<div class="bnr-left">
							<p>入住具体时间</p>
						</div>
						<div class="bnr-right time-pic">
							<input type="text" id="timepicker" name="timepicker" class="timepicker-two form-control"><br>
						</div>
						
						<div class="clearfix"></div>
					</div>
					<div class="bnr-one">
						<div class="bnr-left">
							<p>离店具体时间</p>
						</div>
						<div class="bnr-right time-pic">
							<input type="text" id="timepicker" name="timepicker" class="timepicker-two form-control"><br>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="bnr-one">
						<div class="bnr-left">
							<p>成人数量</p>
						</div>
						<div class="bnr-right">
							<select>
								<option  class="rm" value="1">1</option>
								<option  class="rm" value="2">2</option>
								<option  class="rm" value="3">3</option>
								<option  class="rm" value="4">4</option>
							</select>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="bnr-one">
						<div class="bnr-left">
							<p>小孩数量</p>
						</div>
						<div class="bnr-right">
							<select>
								<option  class="rm" value="0">0</option>
								<option  class="rm" value="1">1</option>
								<option  class="rm" value="2">2</option>
								<option  class="rm" value="3">3</option>
								<option  class="rm" value="4">4</option>
							</select>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="bnr-one">
						<div class="bnr-left">
							<p>选择房间类型</p>
						</div>
						<div class="bnr-right">
							<select id="roomType" onchange="getRoom()">
								<option value="">请选择</option>
								<option value="saab">Single</option>
								<option value="opel">Double</option>
								<option value="audi">Suite</option>
							</select>
						</div>
						<div class="clearfix"></div>
					</div>
					
					<div class="bnr-one">
						<div class="bnr-left">
							<p>预缴押金</p>
						</div>
						<div class="bnr-right">
							<input class="form-control"  type="text">
						</div>
						<div class="clearfix"></div>
					</div>
					
					
					
					<div class="bnr-btn">
						
							<input type="submit" value="登记">
						
					</div>
					</form>
				</div>
				<!---start-date-piker---->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery-ui.css" />
		<script src="${pageContext.request.contextPath}/js/jquery-ui.js"></script>
			<script>
				$(function() {
				$( "#datepicker,#datepicker1" ).datepicker();
				});
			</script>
	<!---/End-date-piker---->
</div>

<!-- js for time-picker -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/wickedpicker.js"></script>
<script type="text/javascript">
	$('.timepicker').wickedpicker({twentyFour: false});
	$('.timepicker-two').wickedpicker({twentyFour: true});
</script>
<!-- /js for time-picker -->
</body>
</html>