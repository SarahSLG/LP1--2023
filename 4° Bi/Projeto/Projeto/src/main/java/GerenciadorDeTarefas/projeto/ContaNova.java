package GerenciadorDeTarefas.projeto;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

    public class ContaNova {
        @FXML
        public Button novoUsuario;

        @FXML
        public TextField apelido;

        @FXML
        public TextField nome;

        @FXML
        public PasswordField senha;

        @FXML
        public PasswordField senhaConf;

        public void novoUsuario() {
            boolean senhaIgual  = senhaConf.getText().equals(senha.getText());

            if(!senhaIgual) {
                return;
            }

            String senhaBdd = senha.getText();

            String nicknameBdd = apelido.getText();

            String usuarioBdd = nome.getText();

            Pessoa usuarioA = new Pessoa(nicknameBdd, usuarioBdd, senhaBdd);
            System.out.println("Cadastrado!");
        }
    }
