// JavaScript Document
class Test {
    private int a;
    private int d;
    private int c;
    
    public void SetC (int x){
    c = x;
    }
    
    public int GetC (){
    return c;
    }
}
class MyAccess {
    public static void main (String [] args) {
    Test t = new Test ();
    //t.a = 1;    
    //t.d = 2;
    //t.c = 3;        
    t.SetC(3);
    
    System.out.println("Result = " + t.GetC());    
    }


}
