package ConstructorProg;                  //without or Non parameterize

public class Prog3 {
      static int a,b;
      public Prog3()
      {
    	  a= 10;
    	  b=20;
    	  System.out.println("This is the zero parameter constructor");   //without parameter
      }
      public static void main(String[] args) {
    	  Prog3 z = new Prog3();
    	  System.out.println("A = "+a);
    	  System.out.println("B = "+b);
    	  
    			  
	}

}
