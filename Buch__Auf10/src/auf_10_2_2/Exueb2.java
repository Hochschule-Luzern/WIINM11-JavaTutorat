package auf_10_2_2;

import java.io.*;

// FileReader nicht in try-Block
public class Exueb2 {
	public static void main(String[] args) {
		FileReader f=new FileReader("Exueb2.java");
		try {
			while (true) {
				int c=f.read();
				if (c<0)
					return;
				System.out.print((char)c);
			}
		}
		catch(IOException e, FileNotFoundException f) {}
	}					
}