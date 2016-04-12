// JavaScript Document
class MyPar 
{
    int a;
    int b;
    MyPar (int x, int y)
    {
        a = x;
        b = y;
    }
    boolean eq (MyPar myPar) 
    {
        if (a == myPar.a & myPap.b) retutn true;
        else return false;
    }
    
    public static void main (String [] args) 
    {
        MyPar o1, o2;
        o1 = new MyPar (1, 2);
        o2 = new MyPar (1, 2);
        
        System.out.println (o1.eq (o2));
    }


}
