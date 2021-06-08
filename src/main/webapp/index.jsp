<html>
<body>


<h2>Form Test</h2>

<form action="<%= request.getContextPath() %>/test" method="post">
    Login: <input type="text" name="login">
    <br> <br>

    Email: <input type="email" name="email">
    <br> <br>

    Password: <input type="password" name="password"><br>

    <br>
    <input type="submit" value="register">
</form>


</body>
</html>
