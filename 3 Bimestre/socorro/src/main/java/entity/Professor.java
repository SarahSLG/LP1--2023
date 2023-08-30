package entity;

import jakarta.persistence.*;

@Entity (name ="Professor")
@Table (name = "Professor")

public class Professor {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String senha;
    @Column
    private String cpf;
    @Column
    private String nome;
    @Column
    private String prontuario;

    public Professor(String senha, String cpf, String nome, String prontuario) {
        this.senha = senha;
        this.cpf = cpf;
        this.nome = nome;
        this.prontuario = prontuario;
    }
}
