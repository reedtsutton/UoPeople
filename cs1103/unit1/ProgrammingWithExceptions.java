
import java.io.*;
import java.util.*;
import java.net.*;

public class ProgrammingWithExceptions {
	
	private static void copyStream(InputStream in, OutputStream out) 
			throws IOException {
			int oneByte = in.read();
			while (oneByte >= 0) { // negative value indicates end-of-stream
			out.write(oneByte);
			oneByte = in.read();
			}
			}


	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter URL :");
	    String link = sc.nextLine();
	    System.out.println("Enter filename :");
	    String filename = sc.nextLine();
	    FileOutputStream out = null;
	    InputStream in = null;
	    try {
	           out = new FileOutputStream(filename);
	           URL url = new URL(link);
	           in = url.openStream();
	           copyStream(in,out);
	       }
	       catch (Exception e){
	            e.printStackTrace();
	       }
	       finally {
	         try{
	           in.close();
	           out.close();
	         }
	         catch (Exception e){
	            e.printStackTrace();
	         }
	       }
	   }


		
	}

