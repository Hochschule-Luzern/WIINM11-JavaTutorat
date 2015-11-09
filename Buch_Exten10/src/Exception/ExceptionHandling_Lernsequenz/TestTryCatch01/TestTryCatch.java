package Exception.ExceptionHandling_Lernsequenz.TestTryCatch01;

//Titel:       Simple Try-Catch Example
//Version:     1.0
//Copyright:   Copyright (c)
//Autor:       Erwin Mathis
//Firma:       Mathis & Partner AG
//Beschreibung: Simple Try-Catch Example



public class TestTryCatch 
{
  public static void main(String[] args) 
  {
    int i = 1; 
    int j = 0;

    try 
    {
      System.out.println("First try block entered");
      System.out.println(i/j);         // Divide by 0 - exception thrown
      System.out.println("Ending first try block");
    }
    // Catch the exception
    catch(ArithmeticException e) 
    {
      System.out.println("Arithmetic exception caught");
    }

    System.out.println("After first try block");
    return;
  }
}
