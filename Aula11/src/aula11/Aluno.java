package aula11;
public class Aluno extends Pessoa{
    // Atributos
    private String curso;
    private int matricula;
    // Métodos Especiais
    public String getCurso() {
        return this.curso;
    }
    public void setCurso(String cu) {
        this.curso = cu;
    }
    public int getMatricula() {
        return this.matricula;
    }
    public void setMatricula(int ma) {
        this.matricula = ma;
    }
    // Métodos Personalizados
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }

    @Override
    public String toString() {        
        return "Aluno{" + "Nome=" + this.getNome() + ", Idade=" + this.getIdade() + ", Sexo=" + this.getSexo() + ", curso=" + curso + ", matricula=" + matricula + '}';
    }
    
}
