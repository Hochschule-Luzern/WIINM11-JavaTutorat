package auf_10_2_5;

import java.io.*;
// 2 mal FileNotFoundException
public class Exueb5 {
	public static void main(String[] args)
			throws FileNotFoundException {
		try {
			FileReader f=new FileReader("Exueb5.java");
			while (true) {
				int c=f.read();
				if (c<0)
					return;
				System.out.print((char)c);
			}
		}
		catch(IOException e) {}
		catch(FileNotFoundException e) {}
		} 
	}