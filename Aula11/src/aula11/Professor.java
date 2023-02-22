package aula11;
public class Professor extends Pessoa {
    // Atributos
    private String especialista;
    private double salario;
    // Métodos Especiais
    public String getEspecialista() {
        return this.especialista;
    }
    public void setEspecialista(String es) {
        this.especialista = es;
    }
    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double sa) {
        this.salario = sa;
    }
    // Métodos Personalizados
    public void receberSalario() {
        System.out.printf("Você recebeu o salário no valor de R$ %.2f", this.salario);
    }

    @Override
    public String toString() {
        System.out.println("");
        return "Professor{" + "especialista=" + especialista + ", salario=" + salario + '}';
    }
    
}
