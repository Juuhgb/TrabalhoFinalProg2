package com;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import modelo.Usuario;
import util.Dao;

import java.util.List;

public class ExibirUsuarioControle {

    private Dao<Usuario> dao;

    @FXML
    private void initialize() {
        dao = new Dao<>(Usuario.class);
    }

    @FXML
    private void exibirUsuarios() {
        List<Usuario> usuarios = dao.listarTodos();
        if (usuarios.isEmpty()) {
            mostrarMensagem("Nenhum usuário cadastrado.");
            return;
        }

        StringBuilder listaUsuarios = new StringBuilder("Usuários cadastrados:\n\n");
        for (Usuario usuario : usuarios) {
            listaUsuarios.append("Login: ").append(usuario.getLogin()).append("\n");
            listaUsuarios.append("Nome: ").append(usuario.getNome()).append("\n");
            listaUsuarios.append("Senha: ").append(usuario.getSenha()).append("\n\n");
        }

        mostrarMensagem(listaUsuarios.toString());
    }

    private void mostrarMensagem(String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);

        // Ajusta o tamanho do campo de texto se a mensagem for longa.
        TextArea textArea = new TextArea(mensagem);
        textArea.setEditable(false);
        textArea.setWrapText(true);

        alert.getDialogPane().setContent(textArea);
        alert.show();
    }
}
