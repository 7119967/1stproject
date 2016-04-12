// JavaScript Document
public class MyClass {

int myClass_propers;

 void SetMyClass_propers (int number)
	{
	   myClass_propers = number;
	}
 int GetMyClass_propers () 
	{
    	return myClass_propers;
	}

public static void main (String [] args) 
{
	MyClass myClass;
	myClass = new MyClass();

    myClass.SetMyClass_propers (5);
    System.out.println ("Result = " + myClass.GetMyClass_propers());    
}


}
