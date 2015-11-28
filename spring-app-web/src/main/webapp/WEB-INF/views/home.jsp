<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
		<h2>Historique des navigation</h2>
	</div>
<div>
<s:form modelAttribute="historique" action="save" method="post">
<table>
					<tr>
					<td>URL</td>
					<td><s:input path="url"/></td>
					<td><s:errors path="url" cssClass="error"/></td>
				</tr>
				<tr>
					<td>Date</td>
					<td><s:input path="date_entree"/></td>
					<td><s:errors path="date_entree" cssClass="error"/></td>
				</tr>
</table>
</s:form>

</div>

<div>
</div>
<table class="tableStyle" border="1">





			<tr>
				
				<th>URL</th>
				<th>DATE</th>
				
			</tr>
			
			
			<c:forEach items="${historiques}" var="p">

				<tr>
					<td>${p.idHistorique_navigation}</td>
					<td>${p.url}</td>
					<td>${p.date_entree}</td>
					
				</tr>

			</c:forEach>
			
		</table>	
			

</body>
</html>