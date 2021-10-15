import java.io.*;
import java.net.*;
public class udpServerEO
{
public static void main(String args[])
{
try
{
DatagramSocket ds = new DatagramSocket(2000);
byte b[] = new byte[1024];
DatagramPacket dp = new DatagramPacket(b,b.length); 
ds.receive(dp);
String str = new String(dp.getData(),0,dp.getLength());
System.out.println(str);
int Number= Integer.parseInt(str);
if(Number==0)
return 1;
Double Fact = 1;
for(int i=Number; i>1; i--)
{
	Fact= Fact*i;
}
return Fact;
String s= new String();
s=Double.toString(Fact);
byte b1[] = new byte[1024];
b1 = s.getBytes();
DatagramPacket dp1 = new
DatagramPacket(b1,b1.length,InetAddress.getLocalHost(),1000);
ds.send(dp1);
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
