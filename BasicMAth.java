public class BasicMAth {

public static void main (String [] args) {

int a = 2 + 3; //5


int b = a + 5; //10
int c = b * a; //50
int d = c - b; //40
int e = a / 2; //2 (not 2.5)
int g = a % 2; //1 

int pre = a++;
int post = ++a;

//a = a + 4;


System.out.println ("pre = " + pre);
System.out.println ("post  = " + post);


}

}