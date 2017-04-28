<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="SaveContact" method="post">

		<input type="text" name="nome" placeholder="Inserisci nome" required> <br>
		<input type="text" name="cognome" placeholder="Inserisci cognome" required><br>
		<input type="text" name="tel" placeholder="Inserisci telefono" required> <br>
		<input type="text" name="mail" placeholder="Inserisci mail" required><br>
		
		<input type="submit" value="Salva">

	</form>

</body>
</html>