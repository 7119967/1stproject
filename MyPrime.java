public class MyPrime {

public static void main (String args[])
{

int number;
boolean isPrime = true;

number = 12;
for (int i = 2; i < number; i++)
{
	if ((number%i)==0) {


	isPrime = false;
	break;
}

}
if (isPrime) System.out.println ("Prime number");
else System.out.println ("Prime is not number");

}
}