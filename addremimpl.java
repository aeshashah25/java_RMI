//implement the interface

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class addremimpl extends UnicastRemoteObject implements addrem
{
public addremimpl() throws RemoteException{}
public int addnum(int a, int b)
{
return(a+b);
}
}