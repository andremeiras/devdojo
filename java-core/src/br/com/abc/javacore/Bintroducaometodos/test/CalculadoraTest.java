package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTest {
    
    public static void main(String[] args) {
        
        System.out.println("\n\n");
        Calculadora.somaDoisNumeros();
        Calculadora.subtraiDoisNumeros();
        Calculadora.multiplicaDoisNumeros(5, 5);
        System.out.print("Divisão de dois numeros: ");
        double result = Calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
        System.out.println(Calculadora.divideDoisNumeros(20, 5));
        System.out.println("\n\nContinuando a exec...\n\n");
    }
}
