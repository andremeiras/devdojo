package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "João";
        estudante.idade = 12;

        double[] notas = {2.8, 8.7, 5.9};
        estudante.calculaMedia(notas);
        
    }
}
