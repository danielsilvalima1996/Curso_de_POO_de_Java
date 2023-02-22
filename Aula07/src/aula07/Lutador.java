package aula07;
public class Lutador {
    // Atributos
    private String nome;
    private char sexo;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    // Métodos Públicos
    String ltd, ao;
    public void apresentar() {
        if (this.getSexo() == 'M') {                
                ltd = "Lutador";
                ao = "o ";
            } else if(this.getSexo() == 'F') {
                ltd = "Lutadora";
                ao = "a ";                
            }
        System.out.println("------------------------------");
        System.out.println("CHEGOU A HORA!");
        System.out.println("Apresentamos " + ao + ltd + ": " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + "m de altura");
        System.out.println("pensando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates!");
    }
    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
    // Métodos Especiais
    public Lutador(String no, char se, String na, int id, float al, float pe, int vi, int de, int em) { //Construtor
        this.nome = no;
        this.sexo = se;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }
    public char getSexo() {
        return this.sexo;
    }
    public void setSexo(char s) {
        this.sexo = s;
    }
    public String getNacionalidade() {
        return this.nacionalidade;
    }
    public void setNacionalidade(String n) {
        this.nacionalidade = n;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int i) {
        this.idade = i;
    }
    public float getAltura() {
        return this.altura;
    }
    public void setAltura(float a) {
        this.altura = a;
    }
    public float getPeso() {
        return this.peso;
    }
    public void setPeso(float p) {
        this.peso = p;
        this.setCategoria();
    }
    public String getCategoria() {
        return this.categoria;
    }
    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public int getVitorias() {
        return this.vitorias;
    }
    public void setVitorias(int v) {
        this.vitorias = v;
    }
    public int getDerrotas() {
        return this.derrotas;
    }
    public void setDerrotas(int d) {
        this.derrotas = d;
    }
    public int getEmpates() {
        return this.empates;
    }
    public void setEmpates(int e) {
        this.empates = e;
    }
}
