package pack;

public class CommandLine {

	
		public static void main(String args[])
		{
			float a=Float.parseFloat(args[0]);
			double b=Double.parseDouble(args[1]);
			String c=args[2];
			int d=Integer.parseInt(args[3]);
			System.out.println("a=" +a);
			System.out.println("b=" +b);
			System.out.println("c=" +c);
			System.out.println("d=" +d);
		}
	}
