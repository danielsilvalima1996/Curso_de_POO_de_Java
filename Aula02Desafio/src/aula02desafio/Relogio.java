package aula02desafio;
public class Relogio {
    //Atributos
    String hora;
    boolean ligado;
    int pilha;
    //Métodos
    void mudarHora(int h, int m) {
        if (this.ligado == true) {
        this.hora = h + ":" + m;
        } else {
            System.out.println("Ligue o relógio");
        }
    }
    
    void desligar() {
        this.ligado = false;
        this.hora = null;
    }
    
    void ligar() {
        this.ligado = true;
        this.mudarHora(pilha, pilha);
    }
    
    void trocarPilha() {
        this.pilha = (100);
    }
    
    void status() {
        System.out.println("********** RELÓGIO **********");
        System.out.println("Hora: " + this.hora);
        System.out.println("Status: " + this.ligado);
        System.out.println("Pilha: " + this.pilha + "%");
    }
}