package pack;

public class Length {

	public static void main(String[] args) {
		String a="Java";
		int size=a.length();//length of string
		char s=a.charAt(2);//extracting a single character from a string
		System.out.println(size);
		System.out.println(s);
		String b="Hai";
		String b1=b.concat("World");//string concatenation
		System.out.println(b1);
		String b2=b1.concat("!!!");
		System.out.println(b2);
		String c="hai";
		String d="Hai";
		String e=new String("Hai");
		System.out.println(b.equals(c)); //checking whether 2 strings are equal
		System.out.println(b.equals(d));
		System.out.println(d.equals(e));//checking whether 2 strings are equal,here the values and cases are checked to be equal or not ,not the memory location
		System.out.println(b.equalsIgnoreCase(c));//method used to neglect the case of the strings
		System.out.println(b==e);//== operator which checks for the m/y first and then check for the content
		System.out.println(b==d);
		int rl=28;
		String u=String.valueOf(rl);
		System.out.println(u);
	}

}
