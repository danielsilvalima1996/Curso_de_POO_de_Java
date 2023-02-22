package aula05;
public class ContaBanco {
    
    //Atributos
    public int numCota;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos Especiais
    public ContaBanco() {   //Construtor
        this.setSaldo(0);
        this.setStatus(false);
    }
    public int getNumConta() {
        return this.numCota;
    }
    public void setNumConta(int num) {
        this.numCota = num;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getDono() {
        return this.dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }
    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean s) {
        this.status = s;
    }
    
    //Métodos Personalizados
    public void estadoAtual() {
        System.out.println("-------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.printf("Saldo: R$ %.2f", this.getSaldo());
        System.out.println("");
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t) {                
        this.setTipo(t);
        this.setStatus(true);
        if (this.getTipo() == "CC") {
            this.setSaldo(50);
        } else if (this.getTipo() == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta() {
        if ((this.saldo == 0) && (this.status == true)) {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        } else if (this.status == false) {
            System.out.println("Conta já está fechada!");
        } else if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada, porquê ainda tem dinheiro!");
        } else {
            System.out.println("Conta não pode ser fechada. pois tem débito!");
        }
    }
    
    public void depositar(float d) {
        if (this.status == true) {
            this.setSaldo(this.getSaldo() + d);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Conta fechada! Impossível depositar!");
        }
    }
    
    public void sacar(float s) {
        if (this.status == true) {
            if (this.saldo >= s) {
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.printf("Saldo insuficiente, valor máximo liberado R$ %.2f", this.getSaldo());
                System.out.println("");
            }           
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    public void pagarMensal() {
        float v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP" ) {
            v = 20;
        }
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada");
        }
    }
}
