import java.net.*;
import java.io.*;
class tcpServerSqureandSquareroot
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
int square = x*x;
double temp;
double sr = x/2;

	do {
		temp = sr;
		sr = (temp + (x / temp)) / 2;
	} while ((temp - sr) != 0);
otc.writeUTF("Square of "+ x + " is: " +square +" \r\nSquare root of "+ x + " is: " +sr);	 
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
