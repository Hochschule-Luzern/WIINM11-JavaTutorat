package auf_10_2_4;

import java.io.*;
// kein catch oder mind. finally-Block!
public class Exueb4 {
	public static void main(String[] args)
			throws FileNotFoundException,IOException {
		FileReader f=new FileReader("Exueb4.java");
		try {
			while (true) {
				int c=f.read();
				if (c<0)
					return;
				System.out.print((char)c);
			}
		}
	}
}