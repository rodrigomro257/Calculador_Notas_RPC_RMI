package server;

import dao.Calculador_Notas_DAO;
import entity.Gabarito;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import middleware.Interface_Calculador_Notas;


public class Calculador_Notas_Remota extends UnicastRemoteObject implements Interface_Calculador_Notas{

    public Calculador_Notas_Remota() throws RemoteException{
        super();
    }
    
    // ÚNICA FUNÇÃO QUE PODE HAVER AQUI.
    // TEM QUE RECEBER UM TXT.
    @Override
    public int calcular_nota(String nome, String questao_1, String questao_2, String questao_3, String questao_4, String questao_5) throws RemoteException{
        int nota_final=0;
        try{
            Calculador_Notas_DAO calcDAO=new Calculador_Notas_DAO();
            String[] respostas_corretas=new String[5];
            respostas_corretas=calcDAO.pega_respostas();
            if(questao_1.equals(respostas_corretas[0])) nota_final++;
            if(questao_2.equals(respostas_corretas[1])) nota_final++;
            if(questao_3.equals(respostas_corretas[2])) nota_final++;
            if(questao_4.equals(respostas_corretas[3])) nota_final++;
            if(questao_5.equals(respostas_corretas[4])) nota_final++;
            calcDAO.armazena_informacoes(nome, questao_1, questao_2, questao_3, questao_4, questao_5, nota_final);
        }
        catch(SQLException ex){
            Logger.getLogger(Calculador_Notas_Remota.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nota_final;
    }
}
