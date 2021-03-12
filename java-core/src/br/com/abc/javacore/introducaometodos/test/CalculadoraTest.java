package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("\n\n");
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(5, 5);
        System.out.print("Divisão de dois numeros: ");
        double result = calc.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(calc.divideDoisNumeros(20, 5));
        System.out.println("\n\nContinuando a exec...\n\n");
    }
}
