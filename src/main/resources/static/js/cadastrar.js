let nome = document.getElementById("input-nome").value;
let senha = document.getElementById("input-senha").value;
let senha2 = document.getElementById("input-senha2").value;
let form = document.getElementById("form");

function verifica_nome(){
    if(document.getElementById("input-nome").value == null || document.getElementById("input-nome").value == " " || document.getElementById("input-nome").value==""){
        alert("digite um nome!!");
        return false;
    }
    else{
        return true
    }
}
function verifica_senha(){
    if(document.getElementById("input-senha").value == null || document.getElementById("input-senha").value == " " || document.getElementById("input-senha").value==""){
        alert("digite uma senha!!");
        return false;
    }
    else{
        return true
    }
}
function verifica_senha2(){
    if(document.getElementById("input-senha").value !=  document.getElementById("input-senha2").value || document.getElementById("input-senha2").value == ""){
        alert("Digite a confirmação da senha!!");
        return false;
    }
    else{
        return true
    }

}
function enviar_formulario(){

    let nome=verifica_nome();
    let senha=verifica_senha();
    let senha2=verifica_senha2();

    if(nome && senha && senha2) {
    form.submit();
    }
    else{
    alert("Não foi possivel enviar o formulario");
    }
}