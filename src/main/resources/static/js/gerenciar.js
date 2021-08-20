let form = document.getElementById("form");

function verifica_nome(){
    if(document.getElementById("input-nome").value == null || document.getElementById("input-nome").value == " " || document.getElementById("input-nome").value==""){
        alert("digite um usuario!!");
        return false;
    }
    else{
        return true
    }
}

function enviar_formulario(){

    let nome=verifica_nome();

    if(nome) {
    form.submit();
    }
    else{
    alert("O nome esta vazio!!");
    }
}
