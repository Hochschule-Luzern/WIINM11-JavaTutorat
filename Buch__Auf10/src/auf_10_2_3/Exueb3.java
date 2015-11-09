package auf_10_2_3;

import java.io.*;

// FileNotFound-Exc. nicht abgefangen!
public class Exueb3 {
	public static void main(String[] args) {
		FileReader f=new FileReader("Exueb3.java");
		try {
			while (true) {
				int c=f.read();
				
				if (c<0)
					return;
				System.out.print((char)c);
			}
			
		}
		catch(FileNotFoundException e) {}
		catch(IOException e) {}
	}
}