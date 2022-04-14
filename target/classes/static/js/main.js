function deletarEstudante(id) {    
    var btnDelete = document.getElementById("excluirEstudante");
    btnDelete.setAttribute("href", "/estudante/remove/" + id);
}

function atualizarEstudante(id, name, email, password) {
    document.getElementById("estudanteAtualizar").action = "/estudante/update/" + id;
    document.getElementById("nomeAtualizar").value = name;
    document.getElementById("emailAtualizar").value = email;
    document.getElementById("senhaAtualizar").value = password;
}

