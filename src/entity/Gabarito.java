package entity;

public class Gabarito {
    private int id_da_questao;
    private String resposta_correta;

    public Gabarito(int id_da_questao, String resposta_correta){
        this.id_da_questao=id_da_questao;
        this.resposta_correta=resposta_correta;
    }
    
    public void setId_da_questao(int id_da_questao){
        this.id_da_questao = id_da_questao;
    }
    public int getId_da_questao(){
        return id_da_questao;
    }

    public void setResposta_correta(String resposta_correta){
        this.resposta_correta = resposta_correta;
    }
    public String getResposta_correta(){
        return resposta_correta;
    }
}
