package auf_10_2_7;

import java.io.*;

// kein try-Block
public class Exueb7 {
	public static void main(String[] args) {
		{
			FileReader f=new FileReader("Exueb7.java");
			while (true) {
				int c=f.read();
				if (c<0) return;
				System.out.print((char)c);
			}
		}
		catch(IOException e){}
	}
}