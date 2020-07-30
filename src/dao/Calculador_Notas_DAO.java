package dao;

import entity.Gabarito;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Calculador_Notas_DAO implements Serializable{
    private Banco_de_Dados bd;
    
    public Calculador_Notas_DAO(){       
    }
    
    public String[] pega_respostas() throws SQLException{
        PreparedStatement pstm;
        ResultSet rs;
        String[] respostas_corretas=new String[5];
        ArrayList listagem=new ArrayList<Gabarito>();
        
        try{
            bd=new Banco_de_Dados(); // CONEXÃO ESTABELECIDA.
            pstm=bd.conecta().prepareStatement("SELECT * FROM gabarito ORDER BY id_da_questao");
            rs=pstm.executeQuery();
            int i=0;
            
            while(rs.next()){
                Gabarito calc_notas=new Gabarito(rs.getInt("id_da_questao"), rs.getString("resposta_correta"));
                respostas_corretas[i]=calc_notas.getResposta_correta();
                i++;
            }
            bd.desconecta();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return respostas_corretas;
    }
    
    public void armazena_informacoes(String nome, String q1, String q2, String q3, String q4, String q5, int nota_final){
        try{
            PreparedStatement pstm;
            bd=new Banco_de_Dados(); // CONECÇÃO ESTABELECIDA.
            pstm=bd.conecta().prepareStatement("INSERT INTO respostas_dos_usuarios "
                                              +"(nome_do_usuario, resposta_q1, resposta_q2, resposta_q3, "
                                              +"resposta_q4, resposta_q5, nota_final) "
                                              +"VALUES (?, ?, ?, ?, ?, ?, ?)");                                           
            pstm.setString(1, nome);
            pstm.setString(2, q1);
            pstm.setString(3, q2);
            pstm.setString(4, q3);
            pstm.setString(5, q4);
            pstm.setString(6, q5);
            pstm.setInt(7, nota_final);
            pstm.executeUpdate();
            bd.desconecta();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
