package entity;

import jakarta.persistence.*;

@Entity (name = "Nota")
@Table (name = "Nota")

public class Nota {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Turma turma;
    @Column
    private Double nota;

    public Nota(Turma turma, Double nota) {
        this.turma = turma;
        this.nota = nota;
    }
}
