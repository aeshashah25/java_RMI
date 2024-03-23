//C:\Program Files\Java\jdk-21\bin
//define remote interface
import java.rmi.*;
public  interface addrem extends Remote
{
public int addnum(int a,int b) throws RemoteException;
}