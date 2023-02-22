package aula10;
public class Aluno extends Pessoa{
    // Atributos
    private int matr;
    private String curso;
    // Métodos Especiais
    public int getMatr() {
        return this.matr;
    }
    public void setMatr(int ma) {
        this.matr = ma;
    }
    public String getCurso() {
        return this.curso;
    }
    public void setCurso(String cu) {
        this.curso = cu;
    }
    // Métodos Personalizados
    public void cancelarMatr() {
        System.out.println("Matrícula cancelada!");
    }
}
