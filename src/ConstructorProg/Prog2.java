package ConstructorProg;

public class Prog2 {
	static int a;
	static int b;
	
	public static void m1()                                //m1 is method name for calling
	{
		b=20;
	}
	public Prog2()                                         //this value is display without calling 
	{                                                      //if given--> public void Prog2()-->then o/p is 0 displayed  
		a=10;
	//	System.out.println("This is constructor");
	}
//	
	
	
	public static void main (String [] args)  {
		Prog2 z = new Prog2();
		
		System.out.println("A =" + a);                  //a=10  this value is display without calling
		System.out.println("B =" + b);                 //b=0  So,  This value is not display without calling
        System.out.println();
		System.out.println("**********************");
		m1();                                         // when this value is calling then this 'b'value is display
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
	  }

}


