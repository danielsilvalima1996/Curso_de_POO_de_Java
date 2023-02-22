package aula10;
public class Funcionario extends Pessoa{
    // Atributos
    private String setor;
    private boolean trabalhando;
    // Métodos Especiais
    public String getSetor() {
        return this.setor;
    }
    public void setSetor(String se) {
        this.setor = se;
    }
    public boolean getTrabalhando() {
        return this.trabalhando;
    }
    public void setTrabalhando(boolean tr) {
        this.trabalhando = tr;
    }
    // Métodos Personalizados
    public void mudarTrabalho() {
        this.setTrabalhando(!(this.getTrabalhando()));
    }
}
