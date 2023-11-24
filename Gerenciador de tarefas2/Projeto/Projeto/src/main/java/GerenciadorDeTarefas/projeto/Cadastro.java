package GerenciadorDeTarefas.projeto;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

public class Cadastro {

    @FXML
    public Button novoUsuario;

    @FXML
    public TextField Cnome;

    @FXML
    public TextField Cemail;

    @FXML
    public TextField Csenha;

    @FXML
    public TextField senhaConf;

    if(Cnome.isEmpty() || Cnome.isEmpty(0 || Csenha.isEmpty())){
        exibirErro("Usuário já existe. Entre com outro nome e usuário");
    } else {
        usuarioService.salvarUsuario(novoUsuario);
        GerenciadorApplication.mudarTela("Login");
    }






}
