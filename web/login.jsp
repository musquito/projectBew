<!DOCTYPE html>
<html >
    <head>
        <meta charset="UTF-8">
        <title>Login Form</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body class="bodycolor">
        <span href="#" class="button" id="toggle-login">Log in</span>
        <div id="login">
            <div id="triangle"></div>
            <h1>Log in</h1>
            <form action="loginAction.do" name="LoginForm" method="get">
                <input type="hidden" name="todo">
                <input type="email" name="user" placeholder="Email" />
                <input type="password" name="prssword" placeholder="Password" />
                <div class="right">
                    <input type="button" class="btn btn-primary" value="Log in" onclick="callLogin('login')"/>
                    <input type="button"  class="btn btn-success"  value="Sing In" onclick="#"/>
                </div>
                <%
                    String errors = (String) request.getAttribute("message");
                    if (errors == null) {
                        errors = "";
                    }
                %>
                <%=errors%>
            </form>
        </div>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <script src="js/index.js"></script>
    </body>
</html>
<script type="text/javascript">
                    function callLogin(todo) {
                        document.LoginForm.todo.value = todo;
                        document.LoginForm.submit();
                    }
</script>

