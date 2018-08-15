package escola;

import java.util.ArrayList;

public class Escola {

    public static void main(String[] args) {
        
        ArrayList<Matricula> m = new ArrayList<>();
        
        Aluno a = new Aluno();
        
        Curso c = new Curso();
        
        Professor p = new Professor();
        Professor p2 = new Professor();
        
        Disciplina d = new Disciplina();
        Disciplina d2 = new Disciplina();
        
        Matricula matricula1 = new Matricula();
        Matricula matricula2 = new Matricula();
        
        c.setId(1);
        c.setNome("ADS");
        
        a.setRa(1711297);
        a.setNome("Adrielly");
        a.setCurso(c);
        
        p.setId(1);
        p.setNome("Bruno");
        
        p2.setId(2);
        p2.setNome("Cristovão");
        
        d.setId(1);
        d.setNome("Estrutura de dados");
        d.setProfessor(p);
        
        d2.setId(2);
        d2.setNome("Banco de dados");
        d2.setProfessor(p2);
        
        matricula1.setId(1);
        matricula1.setAluno(a);
        matricula1.setDisciplina(d);
        
        matricula2.setId(2);
        matricula2.setAluno(a);
        matricula2.setDisciplina(d2);
        
        m.add(matricula1);
        m.add(matricula2);
        
        for (Matricula matricula : m) {
            System.out.println("Matricula nº: " + matricula.getId());
            System.out.println("\n" + matricula.toString());
            System.out.println("********************************************");
            System.out.println("********************************************");
            System.out.println("********************************************");
        }
    }
    
}
