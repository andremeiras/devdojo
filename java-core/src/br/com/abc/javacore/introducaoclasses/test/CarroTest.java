package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.placa = "ABC-1234";
        carro.modelo = "Gol";
        carro.velocidadeMaxima = 190.00f;

        System.out.println(carro);
    }
}
