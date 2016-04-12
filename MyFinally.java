// JavaScript Document
class MyFinally {
    static void firstMethod () {
        try {
            System.out.println ("In firstMethod");
            throw new RuntimeException ("Test");
        } 
        finally {
            System.out.println ("finally for firstMethod");        
        }
        
    }

    static void secondMethod () {
        try {
            System.out.println ("In secondMethod");        
            return;
        }
        finally {
            System.out.println ("finally for secondMethod");        
        }
            
    }

    static void thirdMethod () {
        try {
            System.out.println ("In thirdMethod");        
            return;
        }
        finally {
            System.out.println ("finally for thirdMethod");        
        }
            
    }
    

    public static void main (String [] args) {
        try {
            firstMethod ();
        } 
        catch (Exception e) {
            System.out.println ("Exception " + e);

        }
            secondMethod ();
            thirdMethod ();

    }
}
