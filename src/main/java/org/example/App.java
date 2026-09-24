package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox(10.0);
        vbox.setPadding(new Insets(30.0)); // espaçamento na tela

        Label labelNome = new Label("Nome: "); // cria um rotulo
        TextField tfNome = new TextField(); // cria um campo de texto para que o usuario possa escrever
        Button botaoOK = new Button("OK"); // cria um botao
        Label labelMensagem = new Label();

        botaoOK.setOnAction( e -> {
            labelMensagem.setText("Bem vindo " + tfNome.getText() + " !");
        });

        vbox.getChildren().addAll(labelNome, tfNome, botaoOK, labelMensagem); // junta todos os elementos no campo

        var scene = new Scene(new StackPane(vbox), 320, 240); // mostrar a cena com todos os elementos dentro do campo
        stage.setTitle(":: Boas Vindas! ::"); // coloca título
        stage.setResizable(false); // impede do usuário maximizar a tela
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}