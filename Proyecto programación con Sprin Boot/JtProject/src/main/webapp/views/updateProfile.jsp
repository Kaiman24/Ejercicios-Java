<!doctype html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
          integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    <title>Actualizar perfil</title>
</head>
<body>

<br>
<div class="container">
    <div class="col-sm-6">
        <h3 style="margin-top: 10px">Perfil del usuario</h3>
        <br>
        <form action="updateuser" method="post">
            <div class="form-group">
                <label for="firstName">Nombre de usuario</label>
                <input type="hidden" name="userid" value="${userid }">
                <input type="text" name="username" id="firstName" required placeholder="Tu nombre de usuario*" value="${username }" required class="form-control form-control-lg">
            </div>
            <div class="form-group">
                <label for="email">Correo electr�nico</label>
                <input type="email" class="form-control form-control-lg" required minlength="6" placeholder="Correo electr�nico*" value="${email }" required name="email" id="email"
                       aria-describedby="emailHelp">
                <small id="emailHelp" class="form-text text-muted">Jam�s compartiremos
                tu informaci�n con nadie m�s.</small>
            </div>
            <div class="form-group">
                <label for="password">Contrase�a</label>
                <input type="password" class="form-control form-control-lg" required placeholder="Contrase�a*" value="${password }" required name="password"
                       id="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*?[~`!@#$%\^&*()\-_=+[\]{};:\x27.,\x22\\|/?><]).{8,}" 
                       title="Must contain: at least one number, one uppercase letter, one lowercase letter, 
                       one special character, and 8 or more characters" required>
                       <input type="checkbox" onclick="showPassword()">Mostrar contrase�a
            </div>
            <div class="form-group">
                <label for="Address">Direcci�n</label>
                <textarea class="form-control form-control-lg" rows="3" placeholder="Ingrese su direcci�n" name="address">${address }</textarea>
            </div>

            <input type="submit" value="Actualizar perfil" class="btn btn-primary btn-block"><br>
            
        </form>
    </div>
</div>

<script>
    function showPassword() {
  var x = document.getElementById("password");
  if (x.type === "password") {
    x.type = "text";
  } else {
    x.type = "password";
  }
}
</script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>