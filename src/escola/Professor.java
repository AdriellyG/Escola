package escola;

public class Professor {
    
    private int    _id;
    private String _nome;
    
    // set's
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
