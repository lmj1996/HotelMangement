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

<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,700'
	rel='stylesheet' type='text/css'>
<link href="${pageContext.request.contextPath}/css/font-awesome.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/templatemo-style.css"
	rel="stylesheet">

<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>
	function flush() {
		//刷新页面 ： 后台换页面
		// ajax ： kkkVO
		//----....
		//-----Listkkkk
		//kokok 
		//var h = ''
		//for(i = 0;i< Vo.llllist.length;i++){
		//	h = h + '<tr>'
		//	hhhhhh
		//	h = h + '</tr>'
		//}
		//var fd = fdfd;
		//fd.innerHTML = h
		//
	}
</script>
</head>

<body>
	<!-- Left column -->
	<div class="templatemo-flex-row">
		<div class="templatemo-sidebar">
			<header class="templatemo-site-header">
				<h1>龙腾酒店管理系统</h1>
			</header>
			<div class="profile-photo-container">
				<img src="${pageContext.request.contextPath}/images/banner3.jpg"
					alt="Profile Photo" class="img-responsive">
				<div class="profile-photo-overlay"></div>
			</div>

			<div class="mobile-menu-icon">
				<i class="fa fa-bars"></i>
			</div>
			<nav class="templatemo-left-nav">
				<ul>
					<li><a href="#"><i class="fa fa-area-chart fa-fw"></i>首页</a></li>
					<li><a href="#" class="active"><i class="fa fa-home fa-fw"></i>房间</a></li>
					<li><a href="#"><i class="fa fa-users fa-fw"></i>员工</a></li>
					<li><a href="#"><i class="fa fa-database fa-fw"></i>库存</a></li>
				</ul>
			</nav>
		</div>
		<!-- Main content -->
		<div class="templatemo-content col-1 light-gray-bg">
			<div class="templatemo-top-nav-container">
				<div class="row">
					<nav class="templatemo-top-nav col-lg-12 col-md-12">
						<ul class="text-uppercase">
							<li><a
								href="${pageContext.request.contextPath}/hotle/queryAllRoom.do"
								class="active">查看房间</a></li>

							<li><a href="room_charge.html">房间计费规则</a></li>
						</ul>
					</nav>
				</div>
				<div
					style="width: 20%; position: fixed; margin-left: 52%; margin-top: 1.2%">
					<form class="templatemo-search-form" role="search">
						<div class="input-group">
							<button type="submit" class="fa fa-search"></button>
							<input type="text" class="form-control" placeholder="Search"
								name="search" id="srch-term">
						</div>
					</form>
				</div>
			</div>
			<div class="templatemo-content-container">

				<div>
					<input type="button" data-toggle="modal"
						data-target="#myModal_addroom" name="" value="添加"
						class="form-control"
						style="border-radius: 15px; background-color: #23527C; color: #FFFFFF; font-family: '宋体'; width: 15%;" />
				</div>



				<div style="border: 1px solid rgba(155, 155, 200, 0.5);">
					<table class="table table-hover" style="text-align: center;">
						<thead>
							<tr>
								<td>编号</td>

								<td><select onchange="flush()" class="form-control"
									style="text-align: center;" name="state">
										<option>所有</option>
										<option>空闲</option>
										<option>已租出</option>
										<option>清洁中</option>
								</select></td>

								<td><select onchange="flush()" class="form-control"
									style="text-align: center;" name="floor">
										<option>所有</option>
										<option>1</option>
										<option>2</option>
										<option>3</option>
										<option>4</option>
										<option>5</option>
								</select></td>

								<td><select onchange="flush()" class="form-control"
									style="text-align: center;" name="type">
										<option>所有</option>
										<option>单人间</option>
										<option>双人间</option>
										<option>套房</option>
										<option>商务间</option>
										<option>公寓间</option>
										<option>总统套房</option>
								</select></td>

								<td>价格</td>

								<td>操作</td>

							</tr>
						</thead>

						<tbody>
							<c:forEach items="${requestScope.getRoomVO.listRoomDTO }" var="listDTO">
								<tr>
									<td>${listDTO.room.roomNum }</td>
									<td>${listDTO.room.roomState }</td>
									<td>${listDTO.room.roomFloor }</td>
									<td>${listDTO.room.roomType }</td>
									<td>${listDTO.room.roomPrice }/天</td>
									<td>
										<div class="dropdown">
											<button type="button" class="btn dropdown-toggle"
												id="dropdownMenu1" data-toggle="dropdown">
												操作 <span class="caret"></span>
											</button>
											<ul class="dropdown-menu" role="menu"
												aria-labelledby="dropdownMenu1">
												<li role="presentation"><a role="menuitem"
													tabindex="-1" href="#">住宿登记</a></li>
												<li role="presentation"><a role="menuitem"
													tabindex="-1" href="#">住宿结账</a></li>
												<li role="presentation"><a role="menuitem"
													tabindex="-1" href="#">住宿换房</a></li>

												<li role="presentation"><a role="menuitem"
													tabindex="-1" href="#">完成清扫</a></li>
											</ul>
										</div>
									</td>
								</tr>
							</c:forEach>


						</tbody>

					</table>

					<table class="table  table-striped table-hover table-main">
						<tr>
							<td class="form-control">共 ${requestScope.roomVO.totalPages } 页</td>
							<td class="form-control">共 ${requestScope.roomVO.totalRecords } 条记录</td>
							<td class="form-control">当前第${requestScope.roomVO.pageIndex } 页</td>
							<td class="form-control" colspan="4"><c:if
									test="${requestScope.roomVO.pageIndex == 1}">第一页&nbsp;&nbsp;&nbsp;&nbsp;上一页&nbsp;&nbsp;&nbsp;&nbsp;</c:if>
								<c:if test="${requestScope.roomVO.pageIndex != 1}">
									<a
										href="${pageContext.request.contextPath }/hotel/getAllRoom.do?page=1">第一页&nbsp;&nbsp;&nbsp;&nbsp;</a>
									<a
										href="${pageContext.request.contextPath }/hotel/getAllRoom.do?page=${requestScope.roomVO.pageIndex-1}">上一页&nbsp;&nbsp;&nbsp;&nbsp;</a>

								</c:if> <c:if
									test="${requestScope.roomVO.pageIndex != requestScope.roomVO.totalPages}">
									<a
										href="${pageContext.request.contextPath }/hotel/getAllRoom.do?page=${requestScope.roomVO.pageIndex+1}">下一页&nbsp;&nbsp;&nbsp;&nbsp;</a>
									<a
										href="${pageContext.request.contextPath }/hotel/getAllRoom.do?page=${requestScope.roomVO.totalPages}">最后一页</a>
								</c:if> <c:if
									test="${requestScope.roomVO.pageIndex == requestScope.roomVO.totalPages}">下一页&nbsp;&nbsp;&nbsp;&nbsp; 最后一页</c:if></td>
						</tr>
					</table>

				</div>



				<!--
			    	作者：LMJ
			    	时间：2018-11-02
			    	描述：添加模态框
			    -->
				<div class="modal fade" id="myModal_addroom" tabindex="-1"
					role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">×</button>
								<h4 class="modal-title" id="myModalLabel">添加房间</h4>
							</div>
							<form
								action="${pageContext.request.contextPath}/hotel/addRoom.do"
								method="post">
								<table class="table">

									<tr>
										<td><label>房间类型</label></td>
										<td><select class="form-control" name="roomType">
												<option>单人间</option>
												<option>双人间</option>
												<option>普通套房</option>
												<option>豪华套房</option>
												<option>商务间</option>
												<option>公寓间</option>
												<option>总统套房</option>
										</select></td>
									</tr>

									<tr>
										<td><label>房间价格</label></td>
										<td><input type="text" class="form-control"
											name="roomPrice" placeholder="房价" /></td>
									</tr>

									<tr>
										<td><label>所在楼层</label></td>
										<td><select class="form-control" name="roomFloor">
												<option>1</option>
												<option>2</option>
												<option>3</option>
												<option>4</option>
												<option>5</option>
												<option>6</option>
										</select></td>
									</tr>



								</table>
								<div>
									<input type="submit" name="" value="添加" class="form-control"
										style="border-radius: 15px; background-color: #23527C; color: #FFFFFF; font-family: '宋体';" />
								</div>
							</form>

						</div>
						<!-- /.modal-content -->
					</div>
					<!-- /.modal-dialog -->
				</div>


			</div>
		</div>
	</div>

	<!-- JS -->
	<script
		src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>
	<!-- jQuery -->
	<script
		src="${pageContext.request.contextPath}/js/jquery-migrate-1.2.1.min.js"></script>
	<!--  jQuery Migrate Plugin -->
	<script src="https://www.google.com/jsapi"></script>
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