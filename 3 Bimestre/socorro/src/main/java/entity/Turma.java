package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Turma")
@Table(name = "Turma")

public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String professor;
    @Column
    private Integer horario;
    @Column
    private static List<Aluno> alunos = new ArrayList<>();
    @Column
    private String codigo;

    public Turma(String professor, Integer horario, String codigo) {
        this.professor = professor;
        this.horario = horario;
        this.codigo = codigo;
    }
}
