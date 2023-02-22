package aula13;
public class Mamifero extends Animal{
    // Atributos
    protected String corPelo;
    // Métodos Personalizados
    public String getCorPelo() {
        return this.corPelo;
    }
    public void setCorPelo(String cp) {
        this.corPelo = cp;
    }
    // Métodos Personalizados
    @Override
    public void emitirSom() {
        System.out.println("som de Mamífero");
    }
    
}
