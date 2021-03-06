package escola;

public class Aluno {
    
    private int    _ra;
    private String _nome;
    private Curso  _curso;
    
    public void setRa(int ra){
        this._ra = ra;
    }
    public void setNome(String nome){
        this._nome = nome;
    }
    public void setCurso(Curso curso){
        this._curso = curso;
    }
    
    public int getId(){
        return _ra;
    }
    public String getNome(){
        return _nome;
    }
    public Curso getCurso(){
        return _curso;
    }
    
    public String toString(){
        return "+-------------- Aluno --------------" +
               "\n|Id: " + getId() +
               "\n|Nome: " + getNome() +
               "\n|Curso: " + getCurso().getNome();
    }
}
