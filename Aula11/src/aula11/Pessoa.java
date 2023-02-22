package aula11;
public abstract class Pessoa {
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
    // Métodos Especiais
    public final void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
}
