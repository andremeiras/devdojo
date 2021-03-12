package br.com.abc.javacore.introducaometodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void calculaMedia() {

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        System.out.println();

        double media = 0;
        int i = 0;

        for (double nota : this.notas) {
            i++;
            media += nota;
            System.out.println("Nota " + i + ": " + nota);
        }

        media = media / notas.length;
        System.out.println("\nMédia: " + media);

        if (media > 6) {
            System.out.println("\nAprovado");
        } else {
            System.out.println("\nReprovado");
        }
    }

}
