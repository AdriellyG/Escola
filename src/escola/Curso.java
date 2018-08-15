package escola;

public class Curso {
    
    // set's
    private int    _id;
    private String _nome;
    
    public void setId(int id){
        this._id = id;
    }
    public void setNome(String nome){
        this._nome = nome;
    }
    
    // get's
    public int getId(){
        return _id;
    }
    public String getNome(){
        return _nome;
    }
    
}
