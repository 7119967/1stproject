// JavaScript Document
class Exep {
    
    static void do_it () {
        try {
            int a = 80;
            int b = 0;    
            int c = a / b; 
            System.out.println ("After exception");
        } 
        catch (ArithmeticException e) {
            System.out.println ("// by zero");
        }
            System.out.println ("continue");
    }

    public static void main (String [] args) {
        Exep.do_it();

    }
}
