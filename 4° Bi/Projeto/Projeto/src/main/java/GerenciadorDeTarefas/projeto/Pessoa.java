package GerenciadorDeTarefas.projeto;
import jakarta.persistence.*;

@Entity
@Table(name = "Pessoa")
public class Pessoa {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column
        private String nome;

        @Column
        private String apelido;

        @Column
        private String senha;

        public Pessoa(String apelido, String nome, String senha) {
            super();
            this.apelido = apelido;
            this.nome = nome;
            this.senha = senha;
        }

        public void setApelido(String nickname) {
        this.apelido = nickname;
    }

        public String getApelido() {
            return apelido;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nomeUsuario) {
            this.nome = nomeUsuario;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

        @Override
        public String toString() {
            return "Conta [" + nome + "]:" + apelido + ", " + id;
        }
    }