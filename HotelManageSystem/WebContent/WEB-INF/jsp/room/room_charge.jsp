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
<script>
	function clear(){
		$("#listChargingWay").children().remove();
	}
	
	getChargingWayInfo();
	
	function getChargingWayInfo(){
		$.post("${pageContext.request.contextPath}/hotel/getChargingWay.do",function(data){
			clear();
			if(null==data)
				return
			var table = '';
			$.each(data,function(){
				table  = table + '<tr>'
				+'<td>'+this.chargingWayName+'</td>'
				+'<td>当天：'+this.chargingWayStarttime+'</td>'
				+'<td>次日：'+this.chargingWayEndtime+'</td>'
				+'<td>'+'<button type=\"button\" class=\"btn btn-info\" data-toggle=\"modal\" data-target=\"#myModal_updat\e" id=\"'+this.chargingWayName+'&'+this.chargingWayStarttime+'&'+this.chargingWayEndtime+'&'+this.chargingWayId+'\" onclick=\"sendInfoToModel(this.id)\">修改</button>'
				+'<button type=\"button\" class=\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#myModal_delete\" id=\"'+this.chargingWayId+'\" onclick=\"sendIdToModel(this.id)\">删除</button>'
				+'</td>'+'</tr>'
			});
			$("#listChargingWay").append(table);
			
			
		},"json");
	}

	function sendInfoToModel(id){
		var arr = id.split('&');
		$("#chargingWayName").val(arr[0]);
		$("#chargingWayStarttime").val(arr[1]);
		$("#chargingWayEndtime").val(arr[2]);
		$("#chargingWayId").val(arr[3]);
	}
	function sendIdToModel(id){
		$("#chargingWayId_delete").val(id);
	}
</script>



</head>
<body>
	<!-- Left column -->
	<div class="templatemo-flex-row">

		<jsp:include page="/WEB-INF/jsp/left_nav.jsp"></jsp:include>


		<!-- Main content -->
		<div class="templatemo-content col-1 light-gray-bg">
			<div class="templatemo-top-nav-container">
				<div class="row">
					<nav class="templatemo-top-nav col-lg-12 col-md-12">
						<ul class="text-uppercase">
							<li><a
								href="${pageContext.request.contextPath}/jump/jumpToRoomList.do">查看房间</a></li>
							<li><a
								href="${pageContext.request.contextPath}/jump/jumpToChargeWay.do"
								class="active">房间计费规则</a></li>
						</ul>
					</nav>
				</div>
			</div>
			<div class="templatemo-content-container">

				<div>
					<table class="table">
						<tr>
							<td><input type="button" data-toggle="modal"
								data-target="#myModal_add" name="" value="添加"
								class="form-control"
								style="border-radius: 15px; background-color: #23527C; color: #FFFFFF; font-family: '宋体'; width: 15%;" />
							</td>
						</tr>
					</table>
				</div>

				<div>
					<table class="table table-hover" style="text-align: center;">
						<thead>
							<tr>
								<td>计费规则名称</td>
								<td>计费开始时间</td>
								<td>计费结束时间</td>
								<td>操作</td>
							</tr>
						</thead>
						<tbody id="listChargingWay">

						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

	<!--
    	作者：LMJ
    	时间：2018-11-02
    	描述：添加模态框
    -->
	<div class="modal fade" id="myModal_add" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="modal-title" id="myModalLabel">添加计费方式</h4>
				</div>
				<form
					action="${pageContext.request.contextPath}/hotel/addChargingWay.do"
					method="post">
					<div class="modal-body">
						<div style="text-align: center;">
							<table class="table">
								<tr>
									<td>计费方式：</td>
									<td><input type="text" name="chargingWayName"
										class="form-control" placeholder="请输入计费方式名称" /></td>
								</tr>
								<tr>
									<td>计费开始时间：</td>
									<td>
										<table>
											<tr>
												<td><label>当天：</label></td>
												<td><input type="text" name="chargingWayStarttime"
													class="form-control" placeholder="请输入计费方式开始时间" /></td>
											</tr>
										</table>
									</td>
								</tr>
								<tr>
									<td>计费结束时间：</td>
									<td>
										<table>
											<tr>
												<td><label>次日：</label></td>
												<td><input type="text" name="chargingWayEndtime"
													class="form-control" placeholder="请输入计费方式结束时间" /></td>
											</tr>
										</table>

									</td>
								</tr>
							</table>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						<button type="submit" class="btn btn-primary">添加</button>
					</div>
				</form>

			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>

	<!--
    	作者：LMJ
    	时间：2018-11-02
    	描述：修改模态框
    -->
	<div class="modal fade" id="myModal_update" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="modal-title" id="myModalLabel">修改计费方式</h4>
				</div>
				<form
					action="${pageContext.request.contextPath }/hotel/updateChargingWay.do"
					method="post">
					<div class="modal-body">
						<div style="text-align: center;">
							<input type="hidden" id="chargingWayId" name="chargingWayId" />
							<table class="table">
								<tr>
									<td>计费方式：</td>
									<td><input type="text" name="chargingWayName"
										id="chargingWayName" class="form-control"
										placeholder="请输入计费方式名称" /></td>
								</tr>
								<tr>
									<td>计费开始时间：</td>
									<td>
										<table>
											<tr>
												<td><label>当天：</label></td>
												<td><input type="text" name="chargingWayStarttime"
													id="chargingWayStarttime" class="form-control"
													placeholder="请输入计费方式开始时间" /></td>
											</tr>
										</table>
									</td>
								</tr>
								<tr>
									<td>计费结束时间：</td>
									<td>
										<table>
											<tr>
												<td><label>次日：</label></td>
												<td><input type="text" name="chargingWayEndtime"
													id="chargingWayEndtime" class="form-control"
													placeholder="请输入计费方式结束时间" /></td>
											</tr>
										</table>

									</td>
								</tr>
							</table>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						<button type="submit" class="btn btn-primary">更新</button>
					</div>
				</form>

			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>

	<!--
    	作者：LMJ
    	时间：2018-11-02
    	描述：删除模态框
    -->
	<div class="modal fade" id="myModal_delete" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="modal-title" id="myModalLabel">删除模态框</h4>
				</div>
				<div class="modal-body" style="text-align: center;">是否确认删除？</div>
				<form
					action="${pageContext.request.contextPath }/hotel/deleteChargingWay.do"
					method="post">
					<input type="hidden" id="chargingWayId_delete" name="chargingWayId" />
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						<button type="submit" class="btn btn-primary">删除</button>
					</div>
				</form>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>

	<!-- JS -->
	<script
		src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>
	<!-- jQuery -->
	<script
		src="${pageContext.request.contextPath}/js/jquery-migrate-1.2.1.min.js"></script>
	<!--  jQuery Migrate Plugin -->
	<script>
      /* Google Chart 
      -------------------------------------------------------------------*/
      // Load the Visualization API and the piechart package.
      google.load('visualization', '1.0', {'packages':['corechart']});

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
          data.addRows([
            ['Mushrooms', 3],
            ['Onions', 1],
            ['Olives', 1],
            ['Zucchini', 1],
            ['Pepperoni', 2]
          ]);

          // Set chart options
          var options = {'title':'How Much Pizza I Ate Last Night'};

          // Instantiate and draw our chart, passing in some options.
          var pieChart = new google.visualization.PieChart(document.getElementById('pie_chart_div'));
          pieChart.draw(data, options);

          var barChart = new google.visualization.BarChart(document.getElementById('bar_chart_div'));
          barChart.draw(data, options);
      }

      $(document).ready(function(){
        if($.browser.mozilla) {
          //refresh page on browser resize
          // http://www.sitepoint.com/jquery-refresh-page-browser-resize/
          $(window).bind('resize', function(e)
          {
            if (window.RT) clearTimeout(window.RT);
            window.RT = setTimeout(function()
            {
              this.location.reload(false); /* false to get page from cache */
            }, 200);
          });      
        } else {
          $(window).resize(function(){
            drawChart();
          });  
        }   
      });
      
    </script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/templatemo-script.js"></script>
	<!-- Templatemo Script -->
	
	<script type="text/javascript">
		;
		(function toastrSuccess() {
			var s = '${requestScope.state}';
			if (s == "addChargingWay") {
				toastr.success("添加计费方式成功!")
			}
			if (s == "updateChargingWay") {
				toastr.success("更新计费方式成功!")
			}
			if (s == "deleteChargingWay") {
				toastr.success("删除成功!")
			}
			
		})();
	</script>
	
</body>
</html>