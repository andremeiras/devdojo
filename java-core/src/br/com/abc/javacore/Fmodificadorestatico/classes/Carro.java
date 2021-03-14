package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Carro {
    
    // Lei: velocidade limite de 240 Km/h
    
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite; // atributo static sempre será compartilhado com todos os objetos da classe.
    
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public Carro(){
    }

    public void imprime() {
        System.out.println("-----------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade máxima: " + this.velocidadeMaxima + " KM/h");
        System.out.println("Velocidade limite: " + velocidadeLimite + " KM/h");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    

}
