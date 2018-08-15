package escola;

public class Matricula {
    
    private Aluno      _aluno;
    private Professor  _professor;
    private Disciplina _disciplina;
    
    // set's
    public void setAluno(Aluno aluno){
        this._aluno = aluno;
    }
    public void setProfessor(Professor professor){
        this._professor = professor;
    }
    public void setDisciplina(Disciplina disciplina){
        this._disciplina = disciplina;
    }
    
    // get's
    public Aluno getALuno(){
        return _aluno;
    }
    public Professor getProfessor(){
        return _professor;
    }
    public Disciplina getDisciplina(){
        return _disciplina;
    }
    
}
