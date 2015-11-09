package Exception.ExceptionHandling_Lernsequenz.ZZZExample_Flanagan06;



class MyException extends Exception {
    public MyException() { super(); }
    public MyException(String s) { super(s); }
}
class MyOtherException extends Exception {
    public MyOtherException() { super(); }
    public MyOtherException(String s) { super(s); }
}
class MySubException extends MyException {
    public MySubException() { super(); }
    public MySubException(String s) { super(s); }
}

public class throwtest {
    // This is the main() method.  Note that it uses two
    // catch clauses to handle two standard Java exceptions.
    public static void main(String argv[]) {
        int i;

        // First, convert our argument to an integer
        // Make sure we have an argument and that it is convertible.
        try {
            i = Integer.parseInt(argv[0]);
        }
        catch (ArrayIndexOutOfBoundsException e) { // argv is empty
            System.out.println("Must specify an argument");
            return;
        }
        catch (NumberFormatException e) { // argv[0] isn't an integer
            System.out.println("Must specify an integer argument.");
            return;
        }

        // Now, pass that integer to method a().
        a(i);
     try{
        java.lang.Thread.sleep(4000);
     }
     catch (InterruptedException e)
     {
        System.out.println("Fehler: InterruptedException!");
     }


    }

    // This method invokes b(), which is declared to throw
    // one type of exception.  We handle that one exception.
    public static void a(int i) {
        try {
            b(i);
        }
        catch (MyException e) {                              // Point 1.
            // Here we handle MyException and 
            // its subclass MyOtherException
            if (e instanceof MySubException)
                System.out.print("MySubException: ");
            else
                System.out.print("MyException: ");
            System.out.println(e.getMessage());
            System.out.println("Handled at point 1");
        }
    }

    // This method invokes c(), and handles one of the
    // two exception types that that method can throw.  The other 
    // exception type is not handled, and is propagated up
    // and declared in this method's throws clause.
    // This method also has a finally clause to finish up 
    // the work of its try clause.  Note that the finally clause
    // is executed after a local catch clause, but before a
    // a containing catch clause or one in an invoking procedure.



    public static void b(int i) throws MyException {
        int result;
        try {
            System.out.print("i = " + i);
            result = c(i);
            System.out.print(" c(i) = " + result);
        }
        catch (MyOtherException e) {                          // Point 2
            // Handle MyOtherException exceptions:
            System.out.println("MyOtherException: " + e.getMessage());
            System.out.println("Handled at point 2");
        }
        finally {
            // Terminate the output we printed above with a newline.
            System.out.print("\n");
        }
    }

    // This method computes a value or throws an exception.
    // The throws clause only lists two exceptions, because
    // one of the exceptions thrown is a subclass of another.
    public static int c(int i) throws MyException, MyOtherException {
        switch (i) {
            case 0: // processing resumes at point 1 above
                throw new MyException("input too low");
            case 1: // processing resumes at point 1 above
                throw new MySubException("input still too low");
            case 99:// processing resumes at point 2 above
                throw new MyOtherException("input too high");
            default:
                return i*i;
        }
    }
}
