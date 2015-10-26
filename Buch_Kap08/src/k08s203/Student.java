package k08s203;

import k08s223.Student;

/** Diese Klasse simuliert einen Studenten */
public class Student {

  /** Der Name des Studenten */
  public String name;

  /** Die Matrikelnummer des Studenten */
  public int nummer;
  
  // Ist für alle Instanzen zugänglich. Gemeinsame Variable.
  public static int zaehler = 0;
  
  public Student(){				
		Student.zaehler++;    
	};		
  
  public Student(String name, int nummer2){
	  this.name = name;
	  nummer = nummer2;
  }
  
}
  