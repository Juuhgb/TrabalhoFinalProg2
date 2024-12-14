package com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;

/**
 * JavaFX MenuInicial
 */
public class MenuInicial extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("menu"), 940, 640);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MenuInicial.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
    
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

}