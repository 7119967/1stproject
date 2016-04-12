// JavaScript Document
class First {
    First () {
        System.out.println ("First");
    }
}

class Second extends First {
    Second () {
        System.out.println ("Second");
    }
}

class Third extends Second {
    Third () {
        System.out.println ("Third");
    }
}

class Call {
    public static void main (String [] args) {
    
        Third t = new Third ();
    }

}
