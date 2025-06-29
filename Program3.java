package Assessments;
// Explain the differences between == and equals() in Java. 
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="say";
		String b="say";
		String c=new String("say");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		System.out.println(a==c);
		System.out.println(a.equals(c));
	}

}
