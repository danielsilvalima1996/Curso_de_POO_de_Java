package aula09;
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    // Métodos Especiais
    public Livro(String ti, String au, int tp, Pessoa le) {
        this.titulo = ti;
        this.autor = au;
        this.totPaginas = tp;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = le;        
    }
    public String getTitulo() {
        return  this.titulo;
    }
    public void setTitulo(String ti) {
        this.titulo = ti;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String au) {
        this.autor = au;
    }
    public int getTotPaginas() {
        return this.totPaginas;
    }
    public void setTotPaginas(int tp) {
        this.totPaginas = tp;
    }
    public int getPagAtual() {
        return this.pagAtual;
    }
    public void setPagAtual(int pa) {
        this.pagAtual = pa;
    }
    public boolean getAberto() {
        return this.aberto;
    }
    public void setAberto(boolean ab) {
        this.aberto = ab;
    }
    public Pessoa getLeitor() {
        return this.leitor;
    }
    public void setLeitor(Pessoa le) {
        this.leitor = le;
    }
    // Métodos Personalizados
    public String detalhes() {
        return "***Livro***{" + "\ntitulo = " + titulo + "\nautor = " + autor + "\ntotPaginas = " + totPaginas + ", pagAtual = " + pagAtual + "\naberto = " + aberto + "\nleitor = " + leitor.getNome() + ", idade = " + this.leitor.getIdade() + 
                ", sexo = " + this.leitor.getSexo()
                + '}';
    }
    
    // Métodos da Interface
    @Override
    public void abrir() {
        this.setAberto(true);
        this.setPagAtual(1);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        this.setPagAtual(0);
    }

    @Override
    public void folhear(int pa) {
        if (pa > this.getTotPaginas()) {
         this.setPagAtual(0);   
        } else {
            this.setPagAtual(pa);
        }        
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
    
}
