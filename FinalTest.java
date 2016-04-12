// JavaScript Document
final abstract class First {
     abstract int get ();
     void show () {
        System.out.println ("First");
    }

}

class Second extends First {
    void show () {
        System.out.println ("Second");
    }

}

class FinalTest {
    public static void main (String [] args) {
        Second s = new Second ();
        s.show ();
    }

}
