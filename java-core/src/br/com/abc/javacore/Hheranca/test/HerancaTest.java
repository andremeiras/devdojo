package br.com.abc.javacore.Hheranca.test;

import br.com.abc.javacore.Hheranca.classes.Endereco;
import br.com.abc.javacore.Hheranca.classes.Funcionario;
import br.com.abc.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Endereco endereco = new Endereco();

        pessoa.setNome("Juvenal");
        pessoa.setCpf("321.111.444-99");
        endereco.setRua("Rua 80");
        endereco.setBairro("Bairro 3");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-------------------------");
        Funcionario f = new Funcionario();
        f.setNome("Jubileu");
        f.setCpf("321654987");
        f.setSalario(15000);
        f.setEndereco(endereco);

        f.imprime();


    }
}
