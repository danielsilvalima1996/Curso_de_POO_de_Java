package aula12;
public class Peixe extends Animal{
    // Atributos
    private String corEscama;
    // Métodos Especiais
    public String getCorEscama() {
        return this.corEscama;
    }
    public void setCorEscama(String ce) {
        this.corEscama = ce;
    }
    // Métodos Personalizados
    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâcias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Não faz som");
    }
    
}
