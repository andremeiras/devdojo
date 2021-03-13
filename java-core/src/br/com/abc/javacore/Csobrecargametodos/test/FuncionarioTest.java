package br.com.abc.javacore.Csobrecargametodos.test;

import br.com.abc.javacore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setCpf("071.321.123-85");
        funcionario.setSalario(4500);

        funcionario.imprime();

    }
}
