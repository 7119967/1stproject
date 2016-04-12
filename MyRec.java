// JavaScript Document
class MyRec 
{
    double width;
    double height;
    
    MyRec (double w, double h) 
    {
        width = w;
        height = h;
    
    }
    public static void main (String [] args) 
    {
        MyRec rec = new MyRec (10, 2);
        MyRec rec2 = new MyRec (5, 3);
        System.out.println ("width = " + rec.width + " height = " + rec.height);
        System.out.println ("width = " + rec2.width + " height = " + rec2.height);
    }
}
