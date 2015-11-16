package Exception.ExceptionHandling_Lernsequenz.TryBlockTest02;


//Titel:       Normal Try-Catch Example 
//Version:     1.0
//Copyright:   Copyright (c)
//Autor:       Erwin Mathis
//Firma:       Mathis & Partner AG
//Beschreibung: Normal Try-Catch Example



import java.io.IOException;

public class TryBlockTest
{

//*****************************************************************************
  public static void main(String[] args)
  {
    int[] x = {10, 5, 0};      // Array of three integers

    // This block only throws an exception if method divide() does
    try 
    {
      System.out.println("First try block in main()entered");
      System.out.println("result = "+divide(x,0));  // No error
      x[1] = 0;                // Will cause a divide by zero
      System.out.println("result = "+divide(x,0));  // Arithmetic error
      x[1] = 1;                // Reset to prevent divide by zero
      System.out.println("result = "+divide(x,1));  // Index error
    }
    catch(ArithmeticException e) 
    {
      System.out.println("Arithmetic exception caught in main()");
    }
    catch(ArrayIndexOutOfBoundsException e) 
    {
      System.out.println("Index-out-of-bounds exception caught in main()");
    }
    
    System.out.println("Outside first try block in main()");
    System.out.println("\nPress Enter to exit");

    try 
    {
      System.out.println("In second try block in main()");
      System.in.read();
      return;
    }
    catch (IOException e) 
    {
      System.out.println("I/O exception caught in main()");
    }
    finally 
    {
      System.out.println("finally block for second try block in main()");
    }

    System.out.println("Code after second try block in main()");
  }


//*****************************************************************************
  public static int divide(int[] array, int index) 
  {
    try 
    {
      System.out.println("\nFirst try block in divide() entered");
      array[index + 2] = array[index]/array[index + 1];
      System.out.println("Code at end of first try block in divide()");
      return array[index + 2];
    }
    catch(ArithmeticException e) 
    {
      System.out.println("Arithmetic exception caught in divide()");
    }
    catch(ArrayIndexOutOfBoundsException e) 
    {
      System.out.println("Index-out-of-bounds exception caught in divide()");
    }
    finally
    {
      System.out.println("finally block in divide()");
    }
    System.out.println("Executing code after try block in divide()");
    return array[index + 2];
  }
}
