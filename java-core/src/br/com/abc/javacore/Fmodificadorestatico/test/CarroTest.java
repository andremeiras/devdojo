package br.com.abc.javacore.Fmodificadorestatico.test;

import br.com.abc.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {
    
    public static String teste = "Acessando variável fora do main(). Isto é possível pois a variável é estatica";

    public static void main(String[] args) {
        
        System.out.println(teste);

        Carro.setVelocidadeLimite(220);
        System.out.println(Carro.getVelocidadeLimite());

        // Carro c1 = new Carro("BMW", 280);
        // Carro c2 = new Carro("Audi", 275);
        // Carro c3 = new Carro("Mercedes", 290);
        
        // c1.imprime();
        // c2.imprime();
        // c3.imprime();

        // System.out.println("############");

        // Carro.velocidadeLimite = 220;

        // c1.imprime();
        // c2.imprime();
        // c3.imprime();
    }
}
