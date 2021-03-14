package br.com.abc.javacore.Gassociacao.exercicio.classes;

public class Seminario {

    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print() {
        System.out.println("--------------- Relatório de seminários ---------------");
        System.out.println("Título: " + this.titulo);
        if (this.professor != null) {
            System.out.println("Professor palestrante: " + this.professor.getNome());
        } else {
            System.out.println("Professor não cadastrado.");
        }
        if (this.local != null) {
            System.out.println("Local: " + this.local.getRua() + " - " + this.local.getBairro());
        } else {
            System.out.println("Local não cadastrado.");
        }
        if (alunos != null && alunos.length != 0) {
            System.out.println("---------- Alunos participantes -------------- ");
            for (Aluno aluno : alunos) {
                System.out.println("Nome do aluno: " + aluno.getNome());
            }
            return;
        } else {
            System.out.println("Aluno não cadastrado.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

}
