package br.com.abc.javacore.Bintroducaometodos.classes;

public class Calculadora {
    
    public static void somaDoisNumeros() {
        System.out.println(5+5);
    }

    public static void subtraiDoisNumeros() {
        System.out.println(5-5);
    }

    public static void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static double divideDoisNumeros(double num1, double num2) {
        
        if (num2 != 0) {
            return num1 / num2;
        } 
        return 0;
    }

    public static void imprimeDoisNumerosDivididos(double num1, double num2) {
        System.out.println(num1/num2);
        if (num2 != 0) {
            System.out.println(num1 / num2);
        }
        System.out.println(num1 / num2);
    }

    public static void alteraDoisNumeros(int num1, int num2) {
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
