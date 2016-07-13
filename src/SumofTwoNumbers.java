import java.util.Scanner;

public class SumofTwoNumbers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Enter the values of a & b");
		Scanner nm = new Scanner(System.in);
		a = nm.nextInt();
		b = nm.nextInt();
		c = a + b;
		System.out.println("Sum of two integers = "+c);
	}

}
