//Title:       Aufgabe36
//Version:
//Copyright:   Copyright (c)
//Author:      Erwin Mathis
//Company:     Mathis & Partner AG
//Description: Dieses Programm liefert die Methoden

package Exception.ExceptionHandling_Lernsequenz.ZZExample05;

public class ZZExample05Main {

  public static void main(String[] args) {


    try {
    ZZExample05Main.methTest("Meier", 7);
    }
    catch (FalscheSteuerklasseException e){
       System.out.println("A:!!!!" + e.getMessage());
    }

    try {
      java.lang.Thread.sleep(5000);
    }
    catch(InterruptedException e) {
      System.out.print("A:Fehler");
    }
  }

  public static void  methTest(String name, int steuerklasse)throws FalscheSteuerklasseException{
    try {
      Steuerzahler s = new Steuerzahler(name,steuerklasse);
    }
    catch (FalscheSteuerklasseException e1) {
      System.out.println("A: Fall 1: " + e1.getMessage());
      try {
        Steuerzahler s = new Steuerzahler("Meier",8);
        System.out.println("A: Fall 2: " + e1.getMessage());
      }
      catch (FalscheSteuerklasseException e2) {
        System.out.println("A: Fall 3: " + e2.getMessage());
        throw e2;

      }
    }
  }
}
