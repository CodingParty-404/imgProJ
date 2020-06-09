<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H1>MemberManager-MemberList</H1>

<c:forEach items="${list}" var="i">
<%-- 	<c:out value="${i}"/><br> --%>
	<c:forEach items="${i }" var="j">
		<c:out value="${j.key}"/>
		<c:out value="${j.value}"/>
	</c:forEach>
		<br>
</c:forEach>

</body>
</html>