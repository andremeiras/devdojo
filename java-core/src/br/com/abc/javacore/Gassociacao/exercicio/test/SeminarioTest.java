package br.com.abc.javacore.Gassociacao.exercicio.test;

import br.com.abc.javacore.Gassociacao.exercicio.classes.Professor;
import br.com.abc.javacore.Gassociacao.exercicio.classes.Aluno;
import br.com.abc.javacore.Gassociacao.exercicio.classes.Local;
import br.com.abc.javacore.Gassociacao.exercicio.classes.Seminario;

public class SeminarioTest {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("João", 16);
        Aluno aluno2 = new Aluno("Joana", 22);
        Seminario seminario = new Seminario("Como ser um programador em 7 dias.");
        Professor professor = new Professor("Yoda", "Usar a força para programar");
        Local local = new Local("Rua das Araras", "mato");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        // seminario.setProfessor(professor);
        // seminario.setLocal(local);
        // seminario.setAlunos(new Aluno[]{aluno, aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0] = seminario;
        professor.setSeminarios(semArray);
        seminario.print();
        professor.print();
    }
}
