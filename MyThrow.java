// JavaScript Document
class MyThrow {
    static void proc () {
        try {
            throw new ArithmeticException ("Demo");
   
        } 
        catch (ArithmeticException e) {
            System.out.println ("Our Eception: " + e);
            throw e;
        }
    }
    public static void main (String [] args) {
        try {
            proc ();
        }
        catch (ArithmeticException e) {
            System.out.println ("Catch in method: " + e);
        }
    }
}
