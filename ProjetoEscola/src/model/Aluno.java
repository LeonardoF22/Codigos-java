package model;

public class Aluno {
    private String rm;
    private String nome;
    private String turma;
    private String nomeCurso;
    private String login;
    private String senha;

    //Construtor padrão
    public Aluno(){

    }
    //Primeira sobrecarga
    public Aluno(String login, String senha){
        this.login = login;
        this.senha = senha;
        //Chamar um método que faz autenticação
    }

    public Aluno(String rm, String nome, String turma, String nomeCurso, String login, String senha){
        this(login, senha);
        this.rm = rm;
        this.nome = nome;
        this.turma = turma;
        this.nomeCurso = nomeCurso;
    }

    public String getRm() {
        return rm;
    }

    public void setRm(String rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
       return "Dados do aluno: \n" +
               "RM do aluno: " + rm + "\n" +
               "Nome do aluno: " + nome + "\n" +
               "Turma do aluno: " + turma + "\n" +
               "Nome do curso: " + nomeCurso + "\n";
    }
}
