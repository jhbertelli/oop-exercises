package exercicio3;

import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setName("Thomas");
        aluno.setEnrollmentNumber(1412);

        int countGrades = Integer.parseInt(
            showInputDialog("Quantas notas?")
        );

        for (int i = 0; i < countGrades; i++) {
            Nota grade = new Nota();

            grade.setTitle(showInputDialog("Descrição da nota"));

            grade.setScore(
                Double.parseDouble(showInputDialog("Valor da nota"))
            );

            aluno.addGrade(grade);
        }

        showConfirmDialog(null,
            "Média do aluno: " + aluno.calculateAverageGrade()
        );

        showConfirmDialog(null,
            String.format("O aluno %s está: %s", aluno.getName(), aluno.checkApproval())
        );

        for (var grade : aluno.getGrades())
            showConfirmDialog(
                null,
                String.format(
                    "Título: %s\nNota: %.2f",
                    grade.getTitle(),
                    grade.getScore()
                )
            );
    }
}