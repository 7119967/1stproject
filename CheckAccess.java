// JavaScript Document
class First {
    int x;
    int y;


}

class Second extends First {
    int k;
    int getY(){
        return y;
    }

}

class CheckAccess {
    
    public static void main (String [] args) {
        First f = new First ();
        Second s = new Second ();
        f = s;
        f.k = 0;
        s.getY();
    }

}
