public class MyIf 
{
	public static void main (String [] args) 
	{
		int a1 = 5;
		int a2 = 2;
		int res;

		if (a2 != 0) 
		{
			if (a1 == 5) {System.out.println ("a1 = 5");}
			else {System.out.println ("a1 != 5");}

			res = a1 /a2;
			System.out.println ("Result is" + res);
		}
		else 
		{	
			System.out.println ("Error, a2 = 0");
		}
	}
}