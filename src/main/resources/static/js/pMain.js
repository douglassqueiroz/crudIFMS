function deletarProfessor(id) {    
    var btnDelete = document.getElementById("excluirProfessor");
    btnDelete.setAttribute("href", "/professor/remove/" + id);
}

function atualizarProfessor(id, name, email, password) {
    document.getElementById("professorAtualizar").action = "/professor/update/" + id;
    document.getElementById("nomeAtualizar").value = name;
    document.getElementById("emailAtualizar").value = email;
    document.getElementById("senhaAtualizar").value = password;
}

