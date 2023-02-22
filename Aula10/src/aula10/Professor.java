package aula10;
public class Professor extends Pessoa{
    // Atributos
    private String especialidades;
    private float salario;
    // Métodos Especiais
    public String getEspecialidades() {
        return this.especialidades;
    }
    public void setEspecialidades(String es) {
        this.especialidades = es;
    }
    public float getSalario() {
        return this.salario;
    }
    public void setSalario(float sa) {
        this.salario = sa;
    }
    // Métodos Personalizados
    public void receberAum(float au) {
        this.setSalario(this.getSalario() + au);
    }
}
