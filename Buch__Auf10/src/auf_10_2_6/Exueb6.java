package auf_10_2_6;

import java.io.*;
public class Exueb6 {
	public static void main(String[] args)
			throws FileNotFoundException {
		FileReader f=new FileReader("Exueb6.java");
		try {
			while (true) {
				int c=f.read();
				if (c<0)
					return;
				System.out.print((char)c);
			}
		}
		catch(IOException e) {}
	}
}
