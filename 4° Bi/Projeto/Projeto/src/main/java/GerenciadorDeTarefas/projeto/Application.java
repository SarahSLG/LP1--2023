package GerenciadorDeTarefas.projeto;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("CriaContaController.fxml"));
        Scene cadastro = new Scene(fxmlLoader.load());
        stage.setTitle("Faça seu cadastro!");
        stage.setScene(cadastro);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}