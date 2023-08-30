package org.example;

import entity.Aluno;
import entity.Nota;
import entity.Professor;
import entity.Turma;

public class Main {
    public static void main(String[] args) {

        Professor prof1 = new Professor("4695","25498885","Emanuel", "SP3090884");
        Professor prof2 = new Professor("7895","12345678","Gabi", "SP3090884");
        Turma turma213 = new Turma("Gabi",12, "4652");
        Aluno debora = new Aluno("9865","Debora", "SP634841", 8.0);
        Aluno aLison = new Aluno("6324","ALison", "SP99851", 10.0);
        Aluno Emanuel = new Aluno("8674","Emanuel", "SP9833252", 7.0);
        Nota nota1 = new Nota(turma213, 8.0);
        Nota nota2 = new Nota(turma213, 9.0);
        Nota nota3 = new Nota(turma213, 10.0);


    }
}