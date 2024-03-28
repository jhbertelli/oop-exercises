package exercicio3;

import java.util.ArrayList;

public class Aluno {
    private String name;
    private int enrollmentNumber; // matrícula
    private ArrayList<Nota> grades = new ArrayList<Nota>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(int enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public ArrayList<Nota> getGrades() {
        return grades;
    }

    public void addGrade(Nota nota) {
        grades.add(nota);
    }

    public double calculateAverageGrade() {
        double soma = 0;

        for (var nota : grades)
            soma += nota.getScore();

        double media = soma / grades.size();

        return media;
    }

    public String checkApproval() {
        if (calculateAverageGrade() >= 7)
            return "Aprovado";

        return "Reprovado";
    }
}
