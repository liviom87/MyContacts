<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Update" method="post">

		<input type="text" value="${contact.nome}" name="nome" placeholder="Inserisci nome" required> <br>
		<input type="text" value="${contact.cognome}" name="cognome" placeholder="Inserisci cognome" required><br>
		<input type="text" value="${contact.tel}" name="tel" placeholder="Inserisci telefono" required> <br>
		<input type="text" value="${contact.mail}" name="mail" placeholder="Inserisci mail" required><br>
		
		<input type="submit" value="Salva">

	</form>
</body>
</html>