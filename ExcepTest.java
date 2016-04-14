// JavaScript Document
/*
Throwable
Throwable FillInStackTrace ()
String getLocalizedMessage ()
String getMessage ()
void prInstackTrace ()
void prInstackTrace (PrintStream stream)
void prInstackTrace (PrintWriter stream)
String toString ()
*/

class MyException extends Exception {

    private int d;
    MyException (int x) {
        d = x;
        
    }
    public String toString () {
        return "MyException - type" + d;
    }
}

class ExcepTest {
    static void test (int b) throws MyException {
        System.out.println ("Method test" + b);
        if (b > 1) throw new MyException (b);
        System.out.println ("Finish");
    }
    public static void main (String [] args) {
        try {
            test (1);
            test (10);
        }
        catch (MyException e){
            System.out.println (e);        
        }
    }
}
