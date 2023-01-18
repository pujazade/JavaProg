package ConstructorProg;
                              // multiple constructor overload Prog  //constructor not override
public class Prog5 {
     public Prog5()
     {
    	 System.out.println("this is a zero arugument constructor");
    	 
     }
	public Prog5(int a,int b)
	{
		System.out.println("this is two argument constructor");
		System.out.println("A="+a + "," + "B ="+b);
//		System.out.println("B="+b);
	}
	public Prog5(int c)
	{
		System.out.println("*******************");
		System.out.println("C="+c);
		System.out.println("this is the one argument constructor");
	}
	public Prog5(double d)
	{
		System.out.println("D ="+d);
		System.out.println("this is double type one argument constructor");
	}
	public static void main(String[] args) {
		Prog5 z= new Prog5();
		Prog5 y= new Prog5(10,20);
		Prog5 x= new Prog5(20);
		Prog5 q= new Prog5(22.22);
		

	}

}
