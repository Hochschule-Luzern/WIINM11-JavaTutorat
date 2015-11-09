package auf_10_2_1;


import java.io.*;

// FileNotFound und IOException - Exception nicht abgefangen
public class Exueb1 {
	public static void main(String[] args) {
		FileReader f=new FileReader("Exueb1.java");
		while (true) {
			int c=f.read();
			if (c<0)
				return;
			System.out.print((char)c);
		}
	}
}