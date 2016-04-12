// JavaScript Document
class Out {
    private int x;
    
    void RunInner () {
    In n = new In ();
    n.ShowX ();
    }

    //внутренний класс Out класса   
    static class In {
        void ShowX () {
            System.out.println("Result = " + x);
        }
    }
}
class InnerTest {
    public static void main (String [] args) {
    
    In i = new In ();
    Out o = new Out ();
    o.RunInner ();
    }

}
