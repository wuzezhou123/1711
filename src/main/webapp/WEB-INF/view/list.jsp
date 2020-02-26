<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<link rel="stylesheet" type="text/css" href="/resource/bootstrap.css">
</head>
<body>
	<form action="list.do" method="post">
	<div align="center">
		影片名称&nbsp;<input type="text" name="name" value="${vo.name}">&nbsp;上映时间<input type="text" name="startTime" value="${vo.startTime }">至<input type="text" name="endTime" value="${vo.endTime }"><br>
		导演<input type="text" name="direct" value="${vo.direct }">&nbsp;价格<input type="text" name="startPrice" value="${vo.startPrice }">-<input type="text" name="endPrice" value="${vo.endPrice }"><br>
		电影时代&nbsp;<input type="text" name="years" value="${vo.years }">&nbsp;电影时长<input type="text" name="startTimelong" value="${vo.startTimelong }">-<input type="text" name="endTimelong" value="${vo.endTimelong }">
		<input type="hidden" name="orderName" >
		<input type="hidden" name="orderMethod">
		<input type="hidden" name="pageNum"><button class="btn btn-info">查询</button>
	</div>
	</form>
	
	<table align="center">
		<tr align="center">
			<td><input type="button" value="批量删除" onclick="ps()"><input type="checkbox" onclick="dj(this)"></td>
			<td>影片名</td>
			<td>导演</td>
			<td>票价</td>
			<td><a href="javascript:px('time')">上映时间</a></td>
			<td><a href="javascript:px('timelong')">时长</a></td>
			<td>类型</td>
			<td><a href="javascript:px('years')">年代</a></td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="movie" varStatus="i">
			<tr align="center">
				<td><input type="checkbox" class="xx" value="${movie.id}">${i.count}</td>
				<td>${movie.name}</td>
				<td>${movie.direct}</td>
				<td>${movie.price}</td>
				<td>${movie.time}</td>
				<td>${movie.timelong}</td>
				<td>${movie.type}</td>
				<td>${movie.years}</td>
				<td>${movie.area}</td>
				<td><c:if test="${movie.status==0}">已经下架</c:if><c:if test="${movie.status==1}">正在热映</c:if><c:if test="${movie.status==2}">即将上映</c:if></td>
				<td><input type="button" onclick="xg(${movie.id})" value="修改"><input type="button" value="删除" onclick="sc(${movie.id})"></td>
			</tr>
		</c:forEach>
		<tr align="center">
			<td colspan="100">
				<button onclick="fenye(1)">首页</button>
				<button onclick="fenye(${page.prePage==0?1:page.prePage})">上一页</button>
				<button onclick="fenye(${page.nextPage==0?page.pages:page.nextPage})">下一页</button>
				<button onclick="fenye(${page.pages})">尾页</button><br>
				当前${page.pageNum}/${page.pages}页  共${page.total}条
			</td>
		</tr>
	</table>
	<script type="text/javascript">
		function dj(cc){
			$(".xx").each(function(){
				this.checked=cc.checked;
			});
		}
		function ps(){
			var ids=$(".xx:checked").map(function(){
				return this.value;
			}).get().join();
			alert(ids);
			if(confirm("是否确认要删除这些数据?")){
				$.post("del.do",{"ids":ids},function(flag){
					if(flag){
						alert("删除成功");
						location.reload();
					}
				},"json");
			}
		}
		function fenye(pageNum){
			$("[name='pageNum']").val(pageNum);
			$("form").submit();
		}
	
		function px(arr){
			var orderName=arr;
			var orderMethod="${vo.orderMethod}";

			orderMethod=orderMethod=='desc'?'asc':'desc';
			$("[name='orderName']").val(arr);
			$("[name='orderMethod']").val(orderMethod);
			$("form").submit();
		}
	</script>
</body>
</html>