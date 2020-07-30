package middleware;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface_Calculador_Notas extends Remote{
    public int calcular_nota(String nome, String questao_1, String questao_2, String questao_3, String questao_4, String questao_5) throws RemoteException;
}
