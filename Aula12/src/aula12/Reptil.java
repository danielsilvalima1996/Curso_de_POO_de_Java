package aula12;
public class Reptil extends Animal{
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
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }
    
}
