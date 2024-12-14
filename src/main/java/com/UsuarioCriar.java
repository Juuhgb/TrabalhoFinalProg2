package com;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;

/**
 *
 * @author Jose
 */
public class UsuarioCriar {
    
    @FXML
    private void producaoIncluir() throws IOException{
        MenuInicial.setRoot("producaoIncluir");
    }
    
    @FXML
    private void producaoListarPorVaca() throws IOException{
        MenuInicial.setRoot("producaoListarPorVaca");
    }
    
    @FXML
    private void sair(){
        Platform.exit();
        System.exit(0);
    }
    
    @FXML
    private void vacaAlterar() throws IOException{
        MenuInicial.setRoot("vacaAlterar");
    }
    
    @FXML
    private void vacaIncluir() throws IOException{
        MenuInicial.setRoot("vacaIncluir");
    }
     
    @FXML
    private void usuarioIncluir() throws IOException{
        MenuInicial.setRoot("usuarioIncluir");
    }
    
    @FXML
    private void exibirUsuarios() throws IOException{
        MenuInicial.setRoot("exibirUsuarios");
    }
    
    @FXML
    private void voltarMenu() throws IOException {
        MenuInicial.setRoot("menu");
    }
}
