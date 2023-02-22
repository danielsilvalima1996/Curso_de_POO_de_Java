package aula09;
public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private char sexo;
    // Métodos Especiais
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String no) {
        this.nome = no;        
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public char getSexo() {
        return this.sexo;
    }
    public void setSexo(char se) {
        this.sexo = se;
    }
    // Métodos Publicos
    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
    }
}
