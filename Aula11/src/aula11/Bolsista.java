package aula11;
public final class Bolsista extends Aluno{
    // Atributos
    private float bolsa;    
    // Métodos Especiais
    public float getBolsa() {
        return this.bolsa;
    }
    public void setBolsa(float bo) {
        this.bolsa = bo;
    }
    // Métodos Personalizados
    public void renovarBolsa() {
        System.out.println("Bolsa renovada!");
    }
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado!");
    }

    @Override
    public String toString() {        
        return "Aluno{" + "Nome=" + this.getNome() + ", Idade=" + this.getIdade() + ", Sexo=" + this.getSexo() + ", curso=" + this.getCurso() + ", matricula=" + this.getMatricula() + ", Bolsa=" + this.getBolsa() + "%" + '}';
    }
}
