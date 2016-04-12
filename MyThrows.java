// JavaScript Document
class MyThrows {
    static void one () /*throws IllegalAccessException*/ {
        throw new IllegalAccessException ("Test");
    }
    
    public static void main (String [] args) {
        try {one ();}
        catch (IllegalAccessException e) {
            System.out.println ("Result is " + e);
        }
    }

}
