
//Title:        Aufgabe36
//Version:      
//Copyright:    Copyright (c) 
//Author:       Erwin Mathis
//Company:      Mathis & Partner AG
//Description:  try und catch


package Exception.ExceptionHandling_Lernsequenz.ZZExample05;

public class FalscheSteuerklasseException extends Exception {

  public FalscheSteuerklasseException(int stk) {
    super("B: Falsche Steuerklasse: " + stk);

    System.out.println("B: Der Konstruktor von Exception aufgerufen!");
    System.out.println("B: " + this.toString());

  }
}