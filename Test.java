// JavaScript Document
class Test 
{
int a;
int b;

    void SetAB (int x, int y) 
    {
        a = x;
        b = y;
        System.out.println ("a = " + a, "b = " + b);
    }

    public static void main (String [] args) 
    {
        Test t = new Test ();
        t.SetAB (1, 2);
    }
}
