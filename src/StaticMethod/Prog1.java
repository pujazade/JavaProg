package StaticMethod;
                    //static method call from same class                                                //means one class prog

public class Prog1 {
	public static void show()                                                                          // public static void =static method and show = methods name(call this name means method)
	{
		System.out.println("This is static show method");
		
	}
	public static void display()
	{
		System.out.println("This is static display method");
	}
	
	public static void main(String[] args) {
		{
			System.out.println("Main Started");                                                         //   From this main method is started
			display();                                                                                  //call the method 
		    show();                                                                                     //call the another method 
		    System.out.println("Main Ended");  
		}	

	}
}
