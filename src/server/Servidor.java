package server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Servidor{
    public static void main(String[] args){
        try{
            /*
            // SERVIDOR E CLIENTE NA MESMA MÁQUINA:
            LocateRegistry.createRegistry(1099);
            Calculador_Notas_Remota validador_nota=new Calculador_Notas_Remota();
            Naming.rebind("servidor_calculador_nota", validador_nota);
            System.out.println("Servidor rodando...");
            */
            
            // SERVIDOR E CLIENTE EM MÁQUINAS DIFERENTES:
            // o IP abaixo deve ser trocado para o IP de onde o servidor estiver rodando.
            System.setProperty("java.rmi.server.hostname", "192.168.1.106");
            LocateRegistry.createRegistry(1099);
            Calculador_Notas_Remota validador_nota=new Calculador_Notas_Remota();
            Naming.rebind("servidor_calculador_nota", validador_nota);
            System.out.println("Servidor rodando...");
        }
        catch(MalformedURLException | RemoteException e){
            System.out.println("Erro ao disponibilizar servidor: "+e.getMessage());
        }
    }
}
