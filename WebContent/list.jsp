<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tabella lista informazioni</title>

<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>

</head>
<body>

	<form action="SaveContact" method="get">

		<input type="submit" value="Aggiungi">

	</form>



	<form action="TABELLA INFORMAZIONI" method="get"></form>
	<table>
		<caption>TABELLA INFORMAZIONI</caption>
		<tr>
			<th>ID</th>
			<th>NOME</th>
			<th>COGNOME</th>
			<th>TEL</th>
			<th>MAIL</th>
			<th>SELEZIONE</th>
		</tr>

		<c:forEach items="${list}" var="contact" varStatus="status">

			<tr>
				<td>${status.index +1}</td>
				<td>${contact.nome}</td>
				<td>${contact.cognome}</td>
				<td>${contact.tel}</td>
				<td>${contact.mail}</td>
				<td><a href="Update?id=${contact.id}">Modifica</a>
				<a href="Delete?id=${contact.id}">Elimina</a></td>
			</tr>

		</c:forEach>

	</table>
</body>
</html>