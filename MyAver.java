public class MyAver {

public static void main (String args[])
{
double numbers [] = {11.1, 12.4, 15, 16.3};

double result =0;

for (int i=0; i < numbers.length;i++){

result+=numbers[i];
}
System.out.println (result + " " + result/numbers.length);


}
}