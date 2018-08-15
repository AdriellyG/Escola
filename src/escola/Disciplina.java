package escola;

public class Disciplina {
    
    private int       _id;
    private String    _nome;
    private Professor _professor;
    
    // set's
    public void setId(int id){
        this._id = id;
    }
    public void setNome(String nome){
        this._nome = nome;
    }
    public void setProfessor(Professor professor){
        this._professor = professor;
    }
    
    // get's
    public int getId(){
        return _id;
    }
    public String getNome(){
        return _nome;
    }
    public Professor getProfessor(){
        return _professor;
    }
    
    public String toString(){
        return "+-------------- Disciplina --------------" +
               "\n|Id: " + getId() +
               "\n|Nome: " + getNome() +
               "\n|Professor: " + getProfessor().getNome();
    }
    
}
