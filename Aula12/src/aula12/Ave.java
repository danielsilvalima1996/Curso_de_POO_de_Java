package aula12;
public class Ave extends Animal{
    // Atributos
    private String cor;
    // Métodos Especiais
    public String getCor() {
        return this.cor;
    }
    public void setCor(String co) {
        this.cor = co;
    }
    // Métodos Personalizados

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    public void fazerNinho() {
        System.out.println("Construindo um ninho");
    }
}
