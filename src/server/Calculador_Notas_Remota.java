package server;

import dao.Calculador_Notas_DAO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import middleware.Interface_Calculador_Notas;

public class Calculador_Notas_Remota extends UnicastRemoteObject implements Interface_Calculador_Notas{

    public Calculador_Notas_Remota() throws RemoteException{
        super();
    }
    
    @Override
    public int calcular_nota(File file) throws RemoteException{
        int nota_final=0; // VALOR RETORNADO NA FUNÇÃO REMOTA E ARMAZENADO NO BANCO DE DADOS.
        char trash; // ARMAZENAR O LIXO DESCARTADO NA LEITURA DO ARQUIVO, NÚMERO DA QUESTÃO E -.
        char caractere; // ARMAZENA O CARACTERE DO ARQUIVO DE TEXTO CONTENDO A RESPOSTA DA QUESTÃO.
        String nome=null, questao_1=null, questao_2=null, questao_3=null, questao_4=null, questao_5=null;
        
/*------------------------ LEITURA DO ARQUIVO DE TEXTO -----------------------*/       
        
        BufferedReader reader = null;
        try (FileReader fileReader = new FileReader(file)){
            reader = new BufferedReader(fileReader);
            // readLine LÊ UMA LINHA INTEIRA E read LÊ O CARACTERE SEGUINTE.
            nome=reader.readLine(); // LEITURA DO NOME.
            // LEITURA DAS 5 LINHAS DE RESPOSTA.
            trash=(char)reader.read();
            trash=(char)reader.read();
            questao_1=String.valueOf(caractere=(char)reader.read());
            // FORAM NECESSÁRIAS LEITURAS EXTRAS DEVIDO À QUEBRA DE LINHA NO ARQUIVO DE TEXTO.
            trash=(char)reader.read();
            trash=(char)reader.read();
            trash=(char)reader.read();
            trash=(char)reader.read();
            questao_2=String.valueOf(caractere=(char)reader.read());
            trash=(char)reader.read();
            trash=(char)reader.read();
            trash=(char)reader.read();
            trash=(char)reader.read();
            questao_3=String.valueOf(caractere=(char)reader.read());
            trash=(char)reader.read();
            trash=(char)reader.read();
            trash=(char)reader.read();
            trash=(char)reader.read();
            questao_4=String.valueOf(caractere=(char)reader.read());
            trash=(char)reader.read();
            trash=(char)reader.read();
            trash=(char)reader.read();
            trash=(char)reader.read();
            questao_5=String.valueOf(caractere=(char)reader.read());
            System.out.println("Arquivo lido.");
        }
        catch(FileNotFoundException e){
            Logger.getLogger(Calculador_Notas_Remota.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Erro na leitura do arquivo de texto: "+e.getMessage());
        }
        catch(IOException e){
            Logger.getLogger(Calculador_Notas_Remota.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Erro na leitura do arquivo de texto: "+e.getMessage());
        }
        
        try{
            reader.close();
        }
        catch(IOException e){
            Logger.getLogger(Calculador_Notas_Remota.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Erro ao fechar o arquivo lido: "+e.getMessage());
        }

/*------------------ COMPARAÇÃO COM OS ARQUIVOS DO DATABASE. -----------------*/

        try{
            // CONSULTA A TABELA DE GABARITO NO BANCO DE DADOS.
            Calculador_Notas_DAO calcDAO=new Calculador_Notas_DAO();
            String[] respostas_corretas=new String[5];
            respostas_corretas=calcDAO.pega_respostas();
            // COMPARA AS RESPOSTAS RECEBIDAS DO USUÁRIO COM AS DO GABARITO.
            if(questao_1.equals(respostas_corretas[0])) nota_final++;
            if(questao_2.equals(respostas_corretas[1])) nota_final++;
            if(questao_3.equals(respostas_corretas[2])) nota_final++;
            if(questao_4.equals(respostas_corretas[3])) nota_final++;
            if(questao_5.equals(respostas_corretas[4])) nota_final++;
            // ARMAZENA NO BANCO DE DADOS AS INFORMAÇÕES DO USUÁRIO E SUA NOTA.
            calcDAO.armazena_informacoes(nome, questao_1, questao_2, questao_3, questao_4, questao_5, nota_final);
        }
        catch(SQLException e){
            Logger.getLogger(Calculador_Notas_Remota.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Erro na conexão com o banco de dados por parte do seridor: "+e.getMessage());
        }
        return nota_final;
    }
}
