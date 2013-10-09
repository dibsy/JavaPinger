import java.net.*;
public class PingHost
{
	public static void main(String args[])
	{
		try{		
		String host=args[0];
		Socket sock=new Socket(host,80);
		System.out.println("Host "+host+" is up");
		sock.close();
		}
		catch(Exception e){
			System.out.println("Host "+args[0]+" is unreachable");
		}
	}

}
