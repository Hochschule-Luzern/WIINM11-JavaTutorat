package auf_11_2;

import auf_11_1.Student;
import studienfaecher.Fach;
import static studienfaecher.Fach.*;
public class StudentenTest2 {
  public static void main (String[] args) {
    Student Peter = new Student();
    Peter.setName("Peter Honig");
    Peter.setNummer(12345);
    Peter.setFach(WIRTSCHAFTLICHESSTUDIUM);
    System.out.println(Peter);
    System.out.println("Regelstudienzeit fuer sein Studium: " +
            Peter.getFach().regelstudienzeit() + " Semester.");
  }
}
