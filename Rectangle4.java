// JavaScript Document
class Rectangle4 
{
    double width;
    double height;
    
    double Square () 
    {
        return width * height;        
    }
    
    void SetValues (double w, double h) 
    {
     width = w;
     height = h;
    }
    
    public static void main (String [] args)
    {
        Rectangle rect, rect2, rect3;
        //double sq;
        
        rect = new Rectangle ();
        rect2 = new Rectangle ();
        rect3 = rect; 

        rect.SetValues (10, 2);
        rect2.SetValues (5, 3);
        
        //sq = rect.Square();
        //System.out.println ("Square = " + sq);
        System.out.println ("Square 1 = " + rect.Square());
        System.out.println ("Square 2 = " + rect.Square());        
    }
}
