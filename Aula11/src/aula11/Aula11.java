package aula11;

public class Aula11 {
    public static void main(String[] args) {
        /*Visitante v1 = new Visitante();
        v1.setIdade(18);
        v1.setNome("Daniel");
        v1.setSexo('M');
        System.out.println(v1.toString());*/
        
        Aluno a1 = new Aluno();
        a1.setNome("Alison");
        a1.setIdade(21);
        a1.setSexo('M');
        a1.setCurso("Logística");
        a1.pagarMensalidade();
        a1.setMatricula(210172016);
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Fudencio");
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.setSexo('M');
        b1.pagarMensalidade();
        b1.renovarBolsa();
        System.out.println(b1.toString());
        
        /*Tecnico t1 = new Tecnico();
        t1.setNome("Eduarda");
        t1.setSexo('F');
        t1.setIdade(16);
        t1.setMatricula(123452017);
        t1.setCurso("Enfermagem");
        t1.setRegProfissional(true);
        System.out.println(t1.toString());
        
        Professor p1 = new Professor();
        p1.setEspecialista("Informática");
        p1.setSalario(3055.66);
        p1.setNome("Renato");
        p1.receberSalario();
        System.out.println(p1.toString());*/
    }
    
}
