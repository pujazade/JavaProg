package StaticMethod;

public class Prog7_overload {
	
	public static void m1() {
		System.out.println("this is m1 method");
	}
	public static void m1(int a) 
	{
		System.out.println("A="+a);
		System.out.println("this is m1 method");
	}
	public static void m1(int x,int y) 
	{
		System.out.println("X="+x);
		System.out.println("Y="+y);
		System.out.println("this is m1 method");
	}
	public static void main(String[] args) {

	m1();
	System.out.println("********");
	m1(15);
	System.out.println("********");
	m1(20, 25);	
		
	}

}
