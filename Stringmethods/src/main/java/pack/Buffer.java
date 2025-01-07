package pack;

public class Buffer {

	public static void main(String[] args) {
		StringBuffer Sb=new StringBuffer("Hello ");
		Sb.append("World");//append method which is used to join the multiple strings together.
		Sb.append("!!!");
		System.out.println(Sb);
		Sb.insert(6,"Today's ");//used to add a string to a particular index position
		System.out.println(Sb);
		Sb.replace(0, 5, "Hi");//used to replace the string at a particular position;note:the last index should be +1 ie for replacing Hello and the space we have 5 characters so to remove hello(4 characters) we should give 5 as last index
		System.out.println(Sb);
		Sb.replace(6, 11, "Hi");//used to replace the string at a particular position;note:the last index should be +1 ie for replacing Hello and the space we have 5 characters so to remove hello(4 characters) we should give 5 as last index
		System.out.println(Sb);	
		Sb.delete(0, 5);//used to replace the string at a particular position;note:the last index should be +1 ie for replacing Hello and the space we have 5 characters so to remove hello(4 characters) we should give 5 as last index
		System.out.println(Sb);
		Sb.reverse();//used to reverse a string
		System.out.println(Sb);
	}

}
