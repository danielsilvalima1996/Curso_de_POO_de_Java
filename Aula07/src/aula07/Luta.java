package aula07;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;    
    // Métodos Especiais
    public Lutador getDesafiado() {
        return this.desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return this.desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return this.rounds;
    }
    public void setRound(int r) {
        this.rounds = r;
    }
    public boolean getAprovada() {
        return this.aprovada;
    }
    public void setAprovada(boolean ap) {
        this.aprovada = ap;
    }
    // Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1 != l2 && (l1.getCategoria().equals(l2.getCategoria())) && l1.getSexo() == l2.getSexo()) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    String dfd, dnd, dd;
    public void lutar() {
        if (this.getAprovada()) {
            if (desafiado.getSexo() == 'M') {                
                dfd = "DESAFIADO";
                dnd = "DESAFIANTE";
                dd = "do ";
            } else if(desafiado.getSexo() == 'F') {
                dfd = "DESAFIADA";
                dnd = "DESAFIANTE";
                dd = "da ";
            }
            System.out.println("### " + dfd + " ###");
            this.desafiado.apresentar();
            System.out.println("### " + dnd + " ###");
            this.desafiante.apresentar();
            System.out.println("====== RESULTADO DA LUTA ======");
            Random aleatoria = new Random();
            int vencedor = aleatoria.nextInt(3);
            switch (vencedor) {
                case 0: // Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Ganhou desafiado
                    System.out.println("Vitória " + dd + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // Ganhou desafiante
                    System.out.println("Vitória " + dd + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("===============================");
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }
}
