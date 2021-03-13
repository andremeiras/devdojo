package br.com.abc.javacore.Dsobrecargaconstrutores.test;

import br.com.abc.javacore.Dsobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    
    public static void main(String[] args) {
        Estudante estudante = new Estudante("121212", "Joselito", new double[]{4.5, 5, 8}, "13/03/2021");
        estudante.imprime();
    }
}
