package code.exercises.objects.student.model;

public class Student {

    private String nome;
    private String matricula;
    private String curso;

    public Student(){
        this.curso = null;
        this.matricula = null;
        this.nome = null;
    }

    public String getNome(){
        return nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public String getCurso(){
        return curso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }

    @Override
    public String toString(){
        return "";
    }


}
