package Block10_Aufgabe1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandler {

	public static void main(String[] args) {
		
		/*
		switch(args[0]){
			case "-c": {
				copyFile(args[1], args[2]);
			}
		}
		*/
		
		switch("-c"){
		case "-c": {
			copyFile("C:/tmp/file1.txt", "C:/tmp/file2.txt");
		}
	}

	}

	public static void copyFile(String f1, String f2){
		
		// alt
		FileInputStream f = null;
		try {
			f = new FileInputStream(f1);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} finally{
			try {
				f.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
		// neu - try with resources - schliesst stream automatisch
		try(
				FileInputStream fis = new FileInputStream(f1); 
				FileOutputStream fos = new FileOutputStream(f2);
		){
			int c = -1;
			while((c = fis.read()) != -1){
				System.out.print((char) c);
				fos.write(c);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
