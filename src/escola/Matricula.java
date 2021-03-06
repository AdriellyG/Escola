package escola;

public class Matricula {
    
    private int        _id;
    private Aluno      _aluno;
    private Professor  _professor;
    private Disciplina _disciplina;
    
    // set's
    public void setId(int id){
        this._id = id;
    }
    public void setAluno(Aluno aluno){
        this._aluno = aluno;
    }
    public void setDisciplina(Disciplina disciplina){
        this._disciplina = disciplina;
    }
    
    // get's
    public int getId(){
        return _id;
    }
    public Aluno getALuno(){
        return _aluno;
    }
    public Disciplina getDisciplina(){
        return _disciplina;
    }
    
    
    public String toString(){
        return _aluno.toString() + "\n\n"
                + _disciplina.toString() + "\n\n"
                + _aluno.getCurso().toString() + "\n\n"
                + _disciplina.getProfessor().toString();
    }
}
