// JavaScript Document
import java.util.*;

class MyStack {
    public static void main (String [] args) {
        Stack s = new Stack ();
        for (int i = 0; i < args.length; i++)
            {s.push(args[i]);}
        while (!s.isEmpty()) {
            System.out.println(s.pop());
            //System.out.println(s.peek()); //читает самый верхний элемент
            //System.out.println(s.search("3")); //узнаем позицию элемента 3             
        }
    }

}
