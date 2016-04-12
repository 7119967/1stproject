// JavaScript Document
class First {
    int x;
    private int x;


}

class Second extends First {
    int k;
    int getY(){
        return y;
    }

}

class CheckAcess {
    
    private static void main (String [] args) {
        Second s = new Second ();
        s.getY();
    }

}
