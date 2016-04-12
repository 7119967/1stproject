public call MyRel 
{
	public static void main (String [] args)
	{
		int a1 = 10;
		int a2 = 2;
		boolean rezult;

		System.out.println ("a1 = " + a1 + " a2 = " + a2);

		rezult = a1 > a2;
		System.out.println ("a1 > a2 = " + rezult);

		rezult = a1 < a2;
		System.out.println ("a1 < a2 = " + rezult);

		rezult = a1 == a2;
		System.out.println ("a1 == a2 = " + rezult);

		rezult = a1 != a2;
		System.out.println ("a1 != a2 = " + rezult);

		rezult = a1 >= a2;
		System.out.println ("a1 >= a2 = " + rezult);

		rezult = a1 <= a2;
		System.out.println ("a1 <= a2 = " + rezult);
	}
}