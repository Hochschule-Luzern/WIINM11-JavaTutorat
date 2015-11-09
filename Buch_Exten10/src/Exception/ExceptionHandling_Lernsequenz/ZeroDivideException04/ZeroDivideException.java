package Exception.ExceptionHandling_Lernsequenz.ZeroDivideException04;

//Titel:       ZeroDivideException Class 
//Version:     1.0
//Copyright:   Copyright (c) 
//Autor:       Erwin Mathis
//Firma:       Mathis & Partner AG
//Beschreibung: Definition of our own "ZeroDivideException"-Class
                


public class ZeroDivideException extends Throwable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int index = -1;      // Index of array element causing error

	// Default Constructor
	public ZeroDivideException(){ }

	// Standard constructor
	public ZeroDivideException(String s)
	{
		super(s);                              // Call the base constructor
	}

	public ZeroDivideException(int index)
	{
		super("/ by zero");                    // Call the base constructor
		                                       // wäre this("/ by zero") nicht auch i.O.??
		this.index = index;                    // Set the index value
	}

	// Get the array index value for the error
	public int getIndex()
	{
		
		return index;                          // Return the index value
	}
}

