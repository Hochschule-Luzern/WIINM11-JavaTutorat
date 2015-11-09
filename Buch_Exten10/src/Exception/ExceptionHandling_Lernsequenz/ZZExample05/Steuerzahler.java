
//Title:        Aufgabe36
//Version:      
//Copyright:    Copyright (c) 1998
//Author:       Riccardo Gubser
//Company:      UBS AG
//Description:  try und catch


package Exception.ExceptionHandling_Lernsequenz.ZZExample05;

public class Steuerzahler {

  private String name;
  private int klasse;

  public Steuerzahler(String n, int k) throws FalscheSteuerklasseException {

    switch(k) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:

      name = n;
      klasse = k;
      break;
    default:
      System.out.println("C: Fehler wegen falscher Steuerklasse: " + k);
      throw new FalscheSteuerklasseException(k);
    }
  }
}