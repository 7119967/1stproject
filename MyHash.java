// JavaScript Document
import java.util.*;

class MyHash {
    public static void main (String [] args) {
        Hashtable phonebook = new Hashtable ();
        phonebook.put("Tom", "12345");
        phonebook.put("John", "45546");
        phonebook.put("Mike", "655345");
        phonebook.put("Sasha", "87945");
        phonebook.put("Bill", "5676575");
        phonebook.put("Keen", "45445");
        
        //System.out.println ("Number is " + phonebook.get("Bill")); //вывод на экран имени
        System.out.println (phonebook.contains("12345"));//выводит тру если есть такой номер
        System.out.println (phonebook.containskey("Tom"));//выводит тру если есть такой ключ                
        System.out.println (phonebook.isEmpty());//выводит тру если книга пуста   
        
        phonebook.remove("Keen");                     
        System.out.println (phonebook.containskey("Keen"));//выводит тру если есть такой ключ                

    }

}
