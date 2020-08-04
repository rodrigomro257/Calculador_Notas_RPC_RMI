package middleware;

import java.io.File;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface_Calculador_Notas extends Remote{
    public int calcular_nota(File file) throws RemoteException;
}
