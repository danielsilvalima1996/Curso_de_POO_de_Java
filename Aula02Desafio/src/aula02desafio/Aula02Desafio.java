package aula02desafio;

public class Aula02Desafio {

    public static void main(String[] args) {
        //Classe Estudar
        Estudar e = new Estudar();
        e.materia = "Programação";
        e.estudando = true;
        e.tempo = 40;
        //e.status();        
        e.pararEstudar();
        e.comecarEstudar("Português", 60);
        e.status();
        
        Relogio r = new Relogio();
        r.ligar();
        r.mudarHora(00, 59);
        r.trocarPilha();
        r.desligar();
        r.status();
    }
    
}
