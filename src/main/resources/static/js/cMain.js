function deletarCoordenator(id) {    
    var btnDelete = document.getElementById("excluirCoordenator");
    btnDelete.setAttribute("href", "/coordenator/remove/" + id);
}

function atualizarCoordenator(id, name, email, password) {
    document.getElementById("coordenatorAtualizar").action = "/coordenator/update/" + id;
    document.getElementById("nomeAtualizar").value = name;
    document.getElementById("emailAtualizar").value = email;
    document.getElementById("senhaAtualizar").value = password;
}

