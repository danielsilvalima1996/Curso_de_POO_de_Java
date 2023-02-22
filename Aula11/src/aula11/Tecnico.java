package aula11;
public final class Tecnico extends Aluno {
    // Atributos
    private boolean regProfissional;
    // Métodos Especiais
    public boolean getRegProfissional() {
        return this.regProfissional;
    }
    public void setRegProfissional(boolean rp) {
        this.regProfissional = rp;
    }
    // Métodos Personalizados
    public void praticar() {
        System.out.println("Praticando...");
    }
    @Override
    public String toString() {        
        return "Aluno{" + "Nome=" + this.getNome() + ", Idade=" + this.getIdade() + ", Sexo=" + this.getSexo() + ", curso=" + this.getCurso() + ", matricula=" + this.getMatricula() + ", Registro=" + 
                 this.getRegProfissional()+ '}';
    }
}
