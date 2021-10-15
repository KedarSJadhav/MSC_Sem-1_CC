import java.net.*;
import java.io.*;
class tcpServerCubeandCuberoot
{
public static void main(String args[])
{
try
{
ServerSocket ss = new ServerSocket(8001);
System.out.println("Server Started...............");
Socket s = ss.accept();
DataInputStream in = new DataInputStream(s.getInputStream()); int x= in.readInt();
DataOutputStream otc = new DataOutputStream(s.getOutputStream()); 
if(x> 0)
{
int cube= x*x*x;
double cubeRoot=Math.cbrt(x);
otc.writeUTF("Cube of "+ x + " is: " +cube +" \r\nCube root of "+ x + " is: " +cubeRoot);	 
}
else
{
otc.writeUTF("Enter a number greater than O");
}
}
catch(Exception e)
{
System.out.println(e.toString());
}
}
}
