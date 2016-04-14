public class MyClass {

int myClass_properties;
void setMyClass_properties (int number) {

myClass_properties = number;

}

int getMyClass_properies () {
return myClass_properties;

}

public static void main (String [] args) {

MyClass myClass;
myClass = new MyClass ();
myClass.setMyClass_properties(5);
System.out.println ("Result " + myClass.getMyClass_properies());

}

}