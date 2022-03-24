<%@page import="java.util.List"%>
<%@page import="myblog.Lotto"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
    
<%
	// 자동완성으로 해야 됨 그래야 import도 자동으로 해줌
	Lotto lotto = new Lotto();
	List<Integer> basketList = lotto.getBasketList();
	


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로또 당첨번호</title>
</head>

<style>

#lotto  {
	text-aligh: center;
	margin: 0 auto;
	margin-top: 200px;
}

#Lotto ul li {
	display: inline-block;
/* 	border: 1px solid #000; */
	border-radius: 50%;
	padding: 0px 5px;
	color: #fff;
}

#Lotto ul li.yellow { background-color: #fcc43d; }
#Lotto ul li.red { background-color: #f08b7e; }
#Lotto ul li.blue { background-color: #8cc6e7; }
/*색깔코드 앞에 # 빼먹지않게 주의*/
#Lotto ul li.green { background-color: #6bce9e; }

ul, li {list-style: none;}


</style>


<body>
	<div id="Lotto">
		<h2>당첨번호</h2>
		<ul>
<%
	for(Integer number: basketList) {
		String className = "";
		if(number <= 10) {
			className = "yellow";
		} else if(number <= 20) {
			className = "red";
		} else if(number <= 20) {
			className = "blue";
		} else if(number <= 45) {
			className = "green";
		}
%>	
		<!-- 이렇게 쓰면 태그를 사용할 수 있다  -->
		<!-- f5 누를 때마다 번호 새로 생성돼서 (페이지를 새로 만드니까) -->
		<!-- 퍼센트에 = 붙이는거 잊지말기 -->
		<li class="<%=className%>"><%=number%></li>
<% 
	}
%>	
	

<!-- 			<li>1</li> -->
<!-- 			<li>2</li> -->
<!-- 			<li>3</li> -->
<!-- 			<li>4</li> -->
<!-- 			<li>5</li> -->
<!-- 			<li>6</li> -->
		</ul>
	</div>
</body>
</html>