package ConstructorProg;          //parameterize

public class Prog4 {
	
	public Prog4(int a)
	{
		System.out.println("This is a parametrize constructor"); //with parameter
		System.out.println("A="+a);
	}
	
	public static void main(String[] args) {
		Prog4 z = new Prog4(10);
		

	}

}
