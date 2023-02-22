package aula07;
public class Aula07 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[12];
        
        l[0] = new Lutador("Pretty Boy", 'M', "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", 'M', "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", 'M', "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", 'M', "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UFOCobolo", 'M', "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaard", 'M', "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        l[6] = new Lutador("Cicera", 'F', "Brasil", 47, 1.66f, 65.3f, 18, 1, 4);
        l[7] = new Lutador("Emelly", 'F', "Rússia", 18, 1.63f, 68.1f, 5, 2, 3);
        l[8] = new Lutador("Creuza", 'F', "Afeganistão", 32, 1.80f, 78.9f, 12, 5, 1);
        l[9] = new Lutador("Monstrolina", 'F', "EUA", 24, 1.78f, 83.1f, 10, 3, 0);
        l[10] = new Lutador("Chuly Guardia", 'F', "China", 29, 1.50f, 110.3f, 8, 1, 5);
        l[11] = new Lutador("Joana", 'F', "África do Sul", 20, 1.90f, 113.9f, 15, 2, 3);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[2], l[3]);
        UEC01.lutar();
        l[6].status();
        l[7].status();
    }
    
}
