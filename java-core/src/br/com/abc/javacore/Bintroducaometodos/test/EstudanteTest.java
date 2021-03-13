package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        System.out.println("\n\n--------------------");
        estudante.setNome("João");
        estudante.setIdade(22);
        estudante.setNotas(new double[] {2.8, 8.7, 8.5});
        estudante.calculaMedia();
        System.out.println("\n\n");
        
    }
}
