// JavaScript Document
class MyFinal {

    final int Max = 2;

    boolean equals (int x) {
    
    //Max = 3;

    if (x == Max) return true;
    else return false;
    }
    
    public static void main (String [] args) {
        MyFinal mf = new MyFinal ();
        System.out.println ("Result is " + mf.equals (2));
    }

}
