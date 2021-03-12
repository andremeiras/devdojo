package br.com.abc.javacore.introducaometodos.classes;

public class Estudante {
    public String nome;
    public int idade;
    // public double[] notas;

    public void calculaMedia(double[] notas) {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        
        System.out.println();

        double media = 0;
        
        for(double nota : notas) {
            media += nota;
            System.out.println("Nota: " + nota);
        }
        
        media /= notas.length;
        System.out.println("Média: " + media);
        if (media > 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }
}
