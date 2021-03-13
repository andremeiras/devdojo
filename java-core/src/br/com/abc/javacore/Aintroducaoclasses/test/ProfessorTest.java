package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor joao = new Professor();
        joao.matricula = "1234";
        joao.cpf = "321654987-77";
        joao.rg = "1123456-7";
        joao.nome = "João das Neves";

        System.out.println("Professor: " + joao.nome);
        System.out.println("CPF: " + joao.cpf);
        System.out.println("RG: " + joao.rg);
        System.out.println("Matricula: " + joao.matricula);

    }
}
