package pack;
import java.util.Scanner;
public class Task15
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//String s="Wednesday";
		switch(n)
		{
			case 1:
				System.out.println("Today is Monday");
				break;
			case 2:
				System.out.println("Today is Tuesday");
				break;
			case 3:
				System.out.println("Today is Wednesday");
				break;
			case 4:
				System.out.println("Today is Thursday");
				break;
			case 5:
				System.out.println("Today is Friday");
				break;
			case 6:
				System.out.println("Today is Saturday");
				break;
			case 7:
				System.out.println("Today is Sunday");
				break;
			default:
				System.out.println("Invaild input");
		}
	}
}
