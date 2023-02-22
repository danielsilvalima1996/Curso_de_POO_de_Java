package aula02desafio;
public class Estudar {
    //Atributos
    String materia;
    int tempo;
    boolean estudando;
    
    //Métodos
    void comecarEstudar(String m, int t) {
        this.estudando = true;
        this.materia = m;
        this.tempo = t;
    }
    
    void pararEstudar() {
        this.estudando = false;
        this.materia = null;
        this.tempo = 0;
    }
    
    void mudarMateria(String mat) {
        this.materia = mat;
    }
    
    void mudarTempo(int t) {
        this.tempo += t;
    }
    void status() {
        System.out.println("********** ESTUDAR **********");
        System.out.println("Materia: " + this.materia);
        System.out.println("tempo de estudo: " + this.tempo + " minutos");
        System.out.println("Status: " + this.estudando);
    }
}
