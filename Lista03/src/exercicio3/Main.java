package exercicio3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setName("Thomas");
        aluno.setEnrollmentNumber(1412);

        int countNotas = Integer.parseInt(
            JOptionPane.showInputDialog("Quantas notas?")
        );

        for (int i = 0; i < countNotas; i++) {
            Nota nota = new Nota();

            nota.setTitle(JOptionPane
                .showInputDialog("Descrição da nota")
            );

            nota.setScore(Double
                .parseDouble(JOptionPane.showInputDialog("Valor da nota"))
            );

            aluno.addGrade(nota);
        }

        JOptionPane
            .showConfirmDialog(null,
                "Média do aluno: " + aluno.calculateAverageGrade()
            );

        JOptionPane
            .showConfirmDialog(null,
                String.format("O aluno %s está: %s", aluno.getName(), aluno.checkApproval())
            );
    }
}