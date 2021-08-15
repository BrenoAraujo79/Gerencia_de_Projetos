var eye = document.getElementById("eye");
var eye1 = document.getElementById("eye1");
var inputPassword = document.getElementById("input-password");
var divPassword = document.getElementById("div-password");
var buttonLogin = document.getElementById("button-login");
var buttonCadastro = document.getElementById("button-cadastro");

var hide = false;

buttonLogin.onmousedown = () => {
    console.log("clicked");
    buttonLogin.style = "box-shadow: 0px 0px 10px 10px black;";
}

buttonLogin.onmouseup = () => {
    buttonLogin.style = "box-shadow: none;";
}
buttonLogin.onmouseout = () => {
     buttonLogin.style = "box-shadow: none;";
 }

buttonCadastro.onmousedown = () => {
    buttonCadastro.style = "box-shadow: 0px 0px 10px 10px black;";
}
buttonCadastro.onmouseup = () => {
    buttonCadastro.style = "box-shadow: nome;";
}
buttonCadastro.onmouseout = () => {
    buttonCadastro.style = "box-shadow: nome;";
}



eye.onclick = () => {

    hide = !hide;
    if(hide){
        eye.textContent = "visibility";
        inputPassword.type = "text";

    }else{
        eye.textContent = "visibility_off";
        inputPassword.type = "password";
    }

    console.log(eye.textContent);

}

inputPassword.onfocus = () => {

    divPassword.style = "box-shadow: 0px 0px 10px 10px black;";

}

inputPassword.onblur = () => {

    divPassword.style = "box-shadow: none";

}




