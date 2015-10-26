package Aufgabe5_3;

public class Kalender {
	
	public static void main(String args[]){
		
		String[][][][] kalender = new String[9][][][];
		
		for(int j=0; j<kalender.length;j++){
			
			// Monate erstellen
			kalender[j] = new String[12][][];
			
			
			for(int m=0;m<kalender[j].length;m++){
			
				kalender[j][m] = new String[31][];
				
				// Tage erstellen
				if(m == 1 && (j == 4 || j == 8)){
					kalender[j][m] = new String[28][];
				}				
				
				for(int t = 0;t<kalender[j][m].length;t++){
					
					// Stunden Array erstellen
					
					kalender[j][m][t] = new String[24];
					
					for(int s=1;s<kalender[j][m][t].length; s++){
						kalender[j][m][t][s] = "test";
						if(s==12){
							kalender[j][m][t][s] = "einkaufen";
						}
					}
				}
			}
		}
		kalender[1][11][20][16] = "asdf";
		System.out.println(kalender[1][11][20][16]);
		System.out.println(kalender[1][11][20][12]);
		System.out.println(kalender[4][1][30][16]);
	}
}
