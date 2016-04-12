// JavaScript Document
class First {
    int a;
    int b;

    First (int x, int y) {
        a = x;
        b = y;
    }

    void ShowItems () {
        System.out.println ("a = " + a + " b = " +b);
    }
}

class Second extends First {
    int c;
    
    Second (int x, int y, int z) {
    super (x, y);
    c = z;
    }
    void ShowItems (int g) {
//        super.ShowItems ();
//        System.out.println ("c = " + c);
          System.out.println ("c = " + c + " g = " + g);      
    }    
    
}

class Overshow {

    public static void main (String [] args) {
    
        Second s = new Second (1, 2, 3);
        s.ShowItems ();
        s.ShowItems (4);
    }

}
