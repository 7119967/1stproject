// JavaScript Document
class First {
    private int a;
    private int b;

    int k;
    
    First (int x, int y) {
        a = x;
        b = y;
    }
}

class Second extends First {
    int c;
    
    int k;
    
    Second (int x, int y, int z) {    
        super (x, y);
        //a = x;
        //b = y;
        c = z;    
        super.k = 5;
        System.out.println ("super.k = " + super.k + " k = " + k);
    }
}

class TestSuper {

    public static void main (String [] args) {
    
    Second s = new Second (1, 2 ,3);


    }
}
