// client program

import java.rmi.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class addclient{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter 1st parameter");
int a=sc.nextInt();
System.out.println("enter 2st parameter");
int b=sc.nextInt();
try{
addrem remobj=(addrem) Naming.lookup("rmi:///addrem");
int result=remobj.addnum(a,b);

System.out.println("result:"+result);

}
catch(RemoteException re){
re.printStackTrace();
}
catch(NotBoundException nbe){
nbe.printStackTrace();
}
catch(MalformedURLException mfe){
mfe.printStackTrace();
}
}}