package aula10;
public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private char sexo;
    // Métodos Especiais
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

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    // Métodos Personalizados
    public void fazerAniv() {
        this.setIdade(this.getIdade() + 1);
    }
}
