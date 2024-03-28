package exercicio3;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int matricula;
    private ArrayList<Nota> notas = new ArrayList<Nota>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void adicionarNota(Nota nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        double soma = 0;

        for (var nota : notas)
            soma += nota.getValor();

        double media = soma / notas.size();

        return media;
    }

    public String verificarAprovacao() {
        if (calcularMedia() >= 7)
            return "Aprovado";

        return "Reprovado";
    }
}
