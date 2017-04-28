<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<form action="TABELLA INFORMAZIONI" method="get">

	
	</form>
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
  <tr>
    <td>1</td>
    <td><input type="text" name="nome"></td>
    <td><input type="text" name="cognome"></td>
    <td><input type="text" name="tel"></td>
    <td><input type="text" name="mail"></td>
    <td><input type="submit" value="Salva"><input type="submit" value="Modifica"></td>
  </tr>
  </table>
</body>
</html>