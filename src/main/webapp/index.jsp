<%@ page import="java.time.LocalDate" %>
<html>
<body>
    <h1>Benvenuto Utente Curioso, questa è la mia prima JSP.</h1>
    <p>Oggi è il giorno <%= LocalDate.now() %></p>
    <p>Autore: <a href="autore.jsp">link</a></p>
</body>
</html>
