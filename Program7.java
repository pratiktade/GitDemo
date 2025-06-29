package Assessments;

public class Program7 {

	void area(int a, int b)
	{
		System.out.println(a*b);
	}
	void area(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	void area(float a)
	{
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program7 p=new Program7();
		p.area(2,4);
		p.area(2, 3, 3);
		p.area(4.6f);
		
	}

}
