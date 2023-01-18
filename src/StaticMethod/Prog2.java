package StaticMethod;
             //2. static method call from different class                                                //means different or another class prog

public class Prog2 {
    
	public static void main(String[] args) {
		{
			System.out.println("main enter method");
			Prog1.show();                //call the method from different class
			Prog1.display();
			System.out.println("end of the method");
			
		}
		System.out.println();
		System.out.println("Again start");
		Prog1.show();                     //also recall the method again and again
		Prog1.display();                  //type prog+(cntl+space)--> (dot).enter
  	    System.out.println("End");
		
	}

}
