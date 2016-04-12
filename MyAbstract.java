// JavaScript Document
abstract class First {
    abstract void show ();
    
    void ShowText () {
        System.out.println ("First");
    }
}

class Second extends First{
    void show () {
        System.out.println ("Second");
    }
}

class MyAbstract{
    public static void main (String [] args) {

        First f;
        Second s = new Second ();
//        f = new First ();
//        f = s;
//        f.show ();
//        s.ShowText ();                

        System.out.println ("value = " + 2 + 2);
    }
}
