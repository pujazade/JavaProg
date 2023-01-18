package NonStaticMethod;    //Nonstatic method call for same class

public class NonStaticProg1 {
	
	public void method1()
	{
		System.out.println("This is NonStatic Method");
		System.out.println("This is a important method");
	}
	
	
	public static void main(String[] args) {
		NonStaticProg1 a = new NonStaticProg1();                 // NonStaticProg1 = class name/ Data type
		a.method1();                                             // a =  Object / Variable / reference variable
		                                                         //new = keyword and it is create a new memory of name
	}                                                            //NonStaticProg1() = Object / Constructor
	                                                             //'a'is object in part of class  
                                                                 //Father is class and son is object.
}
