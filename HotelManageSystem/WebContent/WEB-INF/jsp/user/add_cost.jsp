<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Hotel Checkout Form Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="${pageContext.request.contextPath}/css/style_co.css" rel="stylesheet" type="text/css" media="all" />
<script src="${pageContext.request.contextPath}/js/jquery.min_co.js"></script>

<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/jquery-2.11.min.js"></script>
<script
	src="${pageContext.request.contextPath}/js/bootstrap-3.37.min.js"></script>
<script src="${pageContext.request.contextPath}/js/toastr.js"></script>
<link href="${pageContext.request.contextPath}/css/toastr.css"
	rel="stylesheet">
<script type="text/javascript">
	function clear(){
		$("#costlist").children().remove();
	}
	function clear2(){
		$("#costlist2").children().remove();
	}
	getCost();
	function getCost(){
		$.post("${pageContext.request.contextPath}/stock/getCost.do",function(data){
			clear();
			console.log(data)
			var roomId = '${requestScope.roomId}';
			$.each(data,function(){
				var k = '<tr>';
				k = k + '<td>'+this.stockName+'</td>';
				k = k + '<td>'+this.stockRetailprice+'</td>';
				k = k + '<td>'+this.stockNumber+'</td>';
				
				k = k + '<td>';
				
				k = k + '<a href="${pageContext.request.contextPath}/stock/addCost.do?roomId='+roomId+'&stockId='+this.stockId+'">添加</a>';
				
				k = k + '</td>';
				
				k = k + '</tr>';
				
				$("#costlist").append(k);
				
			});
			
		},"json");
	}
</script>

</head>
<body>
<div class="main">
	<h1>服务消费</h1>
	
	<div class="hotel-right" style="height: 740px;width:600px;margin-left: 100px;">
		<a href="${pageContext.request.contextPath}/jump/jumpToRoom.do"><input type="button" value="返回列表" class="form-control"
								style="border-radius: 15px; background-color: #23527C; color: #FFFFFF; font-family: '宋体';width:20%;margin-left: 40%;" /></a> 
		
			<table class="table table-hover" style="text-align: center;">
				<thead>
					<tr>
						<td>物品名称</td>
						<td>单价</td>
						<td>库存数量</td>
						<td>操作</td>
					</tr>
				</thead>
				<tbody id="costlist">
					
				</tbody>
			</table>
			
		
	</div>
	<!-- <div class="hotel-right" style="height: 740px;margin-left: 410px;margin-top: -740px;width:390px">
		
			<form action="#" method="post">
			<table class="table table-hover" style="text-align: center;">
				<thead>
					<tr>
						<td>物品名称</td>
						<td>单价</td>
						<td>数量</td>
						<td>总价</td>
					</tr>
				</thead>
				<tbody id="costlist2">
					
				</tbody>
				<tfoot>
					<tr>
						<td colspan="7">总共消费：<input type="text" id="totalcost" /></td>
					</tr>
				</tfoot>
			</table>
			<input type="submit" value="确认添加" style="border-radius: 15px; background-color: #23527C; color: #FFFFFF; font-family: '宋体';width:50%;margin-left: 25%;" />
			</form>
		</div> -->
	
	<div class="clear"></div>
	
</div>


<script type="text/javascript">
		;
		(function toastrSuccess() {
			var s = '${requestScope.state}';
			if (s == "success") {
				toastr.success("添加消费成功!")
			}
			
			
		})();
	</script>
</body>
</html>