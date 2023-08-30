package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Aluno")
@Table(name = "Aluno")

public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String senha;
    @Column
    @OneToMany
    private static List<Nota> notas = new ArrayList<>();
    @Column
    private String nome;
    @Column
    private String prontuario;
    @Column
    private Double media;

    public Aluno(String senha, String nome, String prontuario, Double media) {
        this.senha = senha;
        this.nome = nome;
        this.prontuario = prontuario;
        this.media = media;
    }

    public List<Nota> getNotas() {
        return notas;
    }

     public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }
}
