<%@page import="java.util.List"%>
<%@page import="myblog.Lotto"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
    
<%
	// �ڵ��ϼ����� �ؾ� �� �׷��� import�� �ڵ����� ����
	Lotto lotto = new Lotto();
	List<Integer> basketList = lotto.getBasketList();
	


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�ζ� ��÷��ȣ</title>
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
/*�����ڵ� �տ� # �������ʰ� ����*/
#Lotto ul li.green { background-color: #6bce9e; }

ul, li {list-style: none;}


</style>


<body>
	<div id="Lotto">
		<h2>��÷��ȣ</h2>
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
		<!-- �̷��� ���� �±׸� ����� �� �ִ�  -->
		<!-- f5 ���� ������ ��ȣ ���� �����ż� (�������� ���� ����ϱ�) -->
		<!-- �ۼ�Ʈ�� = ���̴°� �������� -->
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