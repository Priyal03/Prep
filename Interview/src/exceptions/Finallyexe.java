package exceptions;

public class Finallyexe {

    public static void main(String[] args)
    {
        try
        {
            try
            {
                throw new Exception("exception thrown from try block");
            }
            catch (Exception ex)
            {
                System.out.println("Inner catch block handling {0}." + ex.getMessage());
                throw new Exception();
            }
            finally
            {
            	System.out.println("Inner finally block");
                throw new Exception("exception thrown from finally block");
            }
        }
        catch (Exception ex)
        {
        	System.out.println("Outer catch block handling {0}. "+  ex.getMessage());
        }
        finally
        {
        	System.out.println("Outer finally block");
        }
    }
}
