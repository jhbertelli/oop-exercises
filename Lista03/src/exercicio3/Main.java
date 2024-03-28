package exercicio3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Thomas");
        aluno.setMatricula(1412);

        int countNotas = Integer.parseInt(
            JOptionPane.showInputDialog("Quantas notas?")
        );

        for (int i = 0; i < countNotas; i++) {
            Nota nota = new Nota();

            nota.setTitulo(JOptionPane
                .showInputDialog("Descrição da nota")
            );

            nota.setValor(Double
                .parseDouble(JOptionPane.showInputDialog("Valor da nota"))
            );

            aluno.adicionarNota(nota);
        }

        JOptionPane
            .showConfirmDialog(null,
                "Média do aluno: " + aluno.calcularMedia()
            );

        JOptionPane
            .showConfirmDialog(null,
                String.format("O aluno %s está: %s", aluno.getNome(), aluno.verificarAprovacao())
            );
    }
}