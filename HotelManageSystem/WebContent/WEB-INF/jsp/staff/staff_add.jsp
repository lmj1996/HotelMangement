<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title></title>
<meta name="description" content="">
<meta name="author" content="templatemo">

<link href="${pageContext.request.contextPath}/css/toastr.css"
	rel='stylesheet' type='text/css'>
<script src="${pageContext.request.contextPath}/js/toastr.js"></script>

<link href="${pageContext.request.contextPath}/css/css_google.css"
	rel='stylesheet' type='text/css'>
<link href="${pageContext.request.contextPath}/css/font-awesome.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/templatemo-style.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/jquery-2.11.min.js"></script>
<script
	src="${pageContext.request.contextPath}/js/bootstrap-3.37.min.js"></script>
<script src="${pageContext.request.contextPath}/js/toastr.js"></script>
<link href="${pageContext.request.contextPath}/css/toastr.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/city.js"></script>
<script>
	function clear(){
		$("#position").children().remove();
	}
	
	getPosition();
	
	function getPosition(){
		$.post("${pageContext.request.contextPath}/staff/getAllPosition.do",function(data){
			clear();
			
			if(null == data)
				return
			$.each(data,function(){
				var option = '';
				if(this.positionId == '1'){
					option = option + '<option value=\"'+this.positionId+'\" selected=\"selected\">'+this.positionName+'</option>';
				}else{
					option = option +'<option value=\"'+this.positionId+'\">'+this.positionName+'</option>';
				}
				
				$("#position").append(option);
			});
			
		},"json");
		
	}
	
	
	
</script>

<script type="text/javascript">
	function checkIDnumber(){
		$.post("${pageContext.request.contextPath}/staff/checkIDnumber.do",{
			"id" : "",
			"IDnumber" : $("#IDnumber").val()
		},function(data){
			if(data == "repeat"){
				toastr.error("身份证号重复！");
			}
		},"json");
	}
	function checkPhoneNumber(){
		$.post("${pageContext.request.contextPath}/staff/checkPhoneNumber.do",{
			"id" : "",
			"phoneNumber" : $("#phoneNumber").val()
		},function(data){
			if(data == "phoneRepeat"){
				toastr.error("电话号码重复！");
			}
		},"json");
	}
	
</script>

</head>
<body>
	<div class="templatemo-flex-row">

		<jsp:include page="/WEB-INF/jsp/left_nav.jsp"></jsp:include>


		<!-- Main content -->
		<div class="templatemo-content col-1 light-gray-bg">
			<div class="templatemo-top-nav-container">
				<div class="row">
					<nav class="templatemo-top-nav col-lg-12 col-md-12">
						<ul class="text-uppercase">
							<li><a
								href="${pageContext.request.contextPath}/jump/jumpToStaffList.do">查看员工</a></li>

							
						</ul>
					</nav>
				</div>

			</div>
			<div class="templatemo-content-container">
				<div style="width: 55%; margin-left: 22.5%;">
					<form action="${pageContext.request.contextPath}/staff/addStaff.do"
						method="post">
						<input type="hidden" id="staffAddress" name="staffAddress" />
						<table class="table" style="text-align: center;">
							<tr>
								<td>姓名：</td>
								<td><input type="text" maxlength="10" class="form-control"
									name="staffName" required="required" /></td>
							</tr>
							<tr>
								<td>性别：</td>
								<td>
									<div>
										<label class="radio-inline"> <input
											style="display: inline; cursor: pointer;" type="radio"
											name="staffSex" value="男" checked />男
										</label> <label class="radio-inline"> <input
											style="display: inline; cursor: pointer;" type="radio"
											name="staffSex" value="女">女
										</label>
									</div>
								</td>
							</tr>
							<tr>
								<td>身份证号：</td>
								<td><input type="text" maxlength="18" id="IDnumber"
									onkeyup="value=value.replace(/[^\d]/g,'')" class="form-control"
									name="staffIdnumber" onblur="checkIDnumber()" required="required" /></td>
							</tr>
							<tr>
								<td>联系电话：</td>
								<td><input type="text" maxlength="11" id="phoneNumber"
									onkeyup="value=value.replace(/[^\d]/g,'')" class="form-control"
									name="staffPhone" onblur="checkPhoneNumber()" required="required" /></td>
							</tr>
							<tr>
								<td>联系地址：</td>
								<td>
									<p id="J-demo" style="width: 400px;height: 40px;border: 1px solid #ccc;box-sizing: border-box;"></p>
								</td>
							</tr>
							<tr>
								<td>职位：</td>
								<td><select id="position" class="form-control"
									name="staffPosition"></select></td>
							</tr>

						</table>
						<div style="text-align: center;">
							<input type="submit" value="添加" class="form-control" onclick="getStaffAddress()" name="submit"
								style="border-radius: 15px; background-color: #23527C; color: #FFFFFF; font-family: '宋体';" />
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>




	<script>
		var ylc = yeluochenCity('J-demo', (city) => {
			console.log(city)
		}, null);
		console.log(ylc);
	</script>
	<script type="text/javascript">
			function getStaffAddress(){
				var str = $('#J-demo').html()
				console.log(str)
				$("#staffAddress").val(str);
			}
			
	</script>
	<!-- JS -->
	<script
		src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>
	<!-- jQuery -->
	<script
		src="${pageContext.request.contextPath}/js/jquery-migrate-1.2.1.min.js"></script>
	<!--  jQuery Migrate Plugin -->
	<!-- <script src="https://www.google.com/jsapi"></script> -->
	<!-- Google Chart -->
	<script>
		/* Google Chart 
					      -------------------------------------------------------------------*/
		// Load the Visualization API and the piechart package.
		google.load('visualization', '1.0', {
			'packages' : [ 'corechart' ]
		});

		// Set a callback to run when the Google Visualization API is loaded.
		google.setOnLoadCallback(drawChart);

		// Callback that creates and populates a data table,
		// instantiates the pie chart, passes in the data and
		// draws it.
		function drawChart() {

			// Create the data table.
			var data = new google.visualization.DataTable();
			data.addColumn('string', 'Topping');
			data.addColumn('number', 'Slices');
			data.addRows([ [ 'Mushrooms', 3 ], [ 'Onions', 1 ],
					[ 'Olives', 1 ], [ 'Zucchini', 1 ], [ 'Pepperoni', 2 ] ]);

			// Set chart options
			var options = {
				'title' : 'How Much Pizza I Ate Last Night'
			};

			// Instantiate and draw our chart, passing in some options.
			var pieChart = new google.visualization.PieChart(document
					.getElementById('pie_chart_div'));
			pieChart.draw(data, options);

			var barChart = new google.visualization.BarChart(document
					.getElementById('bar_chart_div'));
			barChart.draw(data, options);
		}

		$(document).ready(function() {
			if ($.browser.mozilla) {
				//refresh page on browser resize
				// http://www.sitepoint.com/jquery-refresh-page-browser-resize/
				$(window).bind('resize', function(e) {
					if (window.RT)
						clearTimeout(window.RT);
					window.RT = setTimeout(function() {
						this.location.reload(false); /* false to get page from cache */
					}, 200);
				});
			} else {
				$(window).resize(function() {
					drawChart();
				});
			}
		});
	</script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/templatemo-script.js"></script>
	<!-- Templatemo Script -->
	
</body>
</html>