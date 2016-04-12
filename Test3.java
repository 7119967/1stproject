// JavaScript Document
class First 
{
    int x, y;
    void show () 
    {
        System.out.println("x = " + x + ", y = " + y);
    }

}

class Second extends First 
{
    int z;
    void show2 () 
    {
        System.out.println("z = " + z);
    }
}

class Test3 
{
    public static void main (String [] args)
    {
        First f = new First ();
        Second d = new Second ();
                
        f.x = 1;
        f.y = 2;
        f.show();

        d.x = 3;
        d.y = 4;                
        d.show();

        d.z = 5;                
        d.show2();
                        
//        System.out.println("z = " + z);
    }

}
