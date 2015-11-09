package k10s300;

import java.io.*;
import Prog1Tools.*;
public class LiesAusDatei {
	public static void main(String[] args) {
		// Lies den Dateinamen ein:
		String dateiname = IOTools.readString("Dateiname: ");
		// Oeffne die Datei zum Lesen:
		FileReader dateileser = new FileReader(dateiname);
		// Lies alle Zeichen aus der Datei ein (read liefert int)
		// bis das Dateiende erreicht wird (signalisiert durch -1)
		// und gib sie (wieder als Buchstabe) auf den Bildschirm aus:
		System.out.println("In der Datei tonarten.txt steht");
		while (true) {
			int gelesen = dateileser.read();
			if (gelesen == -1)
				break;
			System.out.print((char) gelesen);
		}
		dateileser.close();
	}
}
