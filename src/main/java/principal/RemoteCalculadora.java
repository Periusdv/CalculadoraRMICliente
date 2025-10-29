package principal;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteCalculadora extends Remote{
    
    public double getValorA() throws RemoteException;
    public double getValorB() throws RemoteException;
    
    public void setValorA(double valorA) throws RemoteException;
    public void setValorB(double valorB) throws RemoteException;
    
    public double getSoma() throws RemoteException;
    public double getDiferenca() throws RemoteException;
    public double getMultiplicacao() throws RemoteException;
    public double getDivisao() throws RemoteException;
}
