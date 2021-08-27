let form = document.getElementById("form");

function verifica_nome(){
    if(document.getElementById("input-nome").value == null || document.getElementById("input-nome").value == " " || document.getElementById("input-nome").value==""){
        alert("digite o nome antigo!!");
        return false;
    }
    else{
        return true
    }
}

function verifica_senha(){
    if(document.getElementById("input-senha").value == null || document.getElementById("input-senha").value == " " || document.getElementById("input-senha").value==""){
        alert("digite a nova senha!!");
        return false;
    }
    else{
        return true
    }
}

function verifica_nome_Atual(){
    if(document.getElementById("input-nome-Atual").value == null || document.getElementById("input-nome-Atual").value == " " || document.getElementById("input-nome-Atual").value==""){
        alert("digite o nome Atual!!");
        return false;
    }
    else{
        return true
    }
}

function enviar_formulario(){

    let nome=verifica_nome();
    let nome_Atual=verifica_nome_Atual();
    let senha=verifica_senha();

    if(nome && nome_Atual && senha) {
    form.submit();
    }
    else{
    alert("O formulario nao pode ser enviado!!");
    }
}
