public class Turma {
    
    private Long idTurma;
    private String dataInicio;
    private String turno;
    private Byte capacidadeAlunos;
 
    //Método construtor
    public Turma(Integer numeroItemFaturadoRecebido, String descricaoItemRecebido, Integer quantidadeCompradaRecebido, Double precoUnitarioRecebido){
        
    }
    
    public Turma(Long idTurma, String dataInicio,String turno, Byte capacidadeAlunos){
    
        this.idTurma = idTurma;
        this.dataInicio = dataInicio;
        this.turno = turno;
        this.capacidadeAlunos = capacidadeAlunos;
    }
    
    //Geters e Seters
    public Long getidTurma(){
        return idTurma;
    }
    
    public void setidTurma(Long idTurma){
        this.idTurma = idTurma;
    }
    
    public String getdataInicio(){
        return dataInicio;
    }
    
    public void setdataInicio(String dataInicio){
        this.dataInicio = dataInicio;
    }
    
    public String getturno(){
        return turno;
    }
    
    public void setturno(String turno){
        this.turno = turno;
    }
    
    public Byte getcapacidadeAlunos(){
        return capacidadeAlunos;
    }
    
    public void setcapacidadeAlunos(Byte capacidadeAlunos){
        this.capacidadeAlunos = capacidadeAlunos;
    }
}

