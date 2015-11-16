package auf_11_1;

import studienfaecher.Fach;
import static studienfaecher.Fach.*;

public class StudentenTest {
  public static void main (String[] args) {
    Student Peter = new Student();
    Peter.setName("Peter Honig");
    Peter.setNummer(12345);
    Peter.setFach(WIRTSCHAFTLICHESSTUDIUM);
    System.out.println(Peter);
  }
}
