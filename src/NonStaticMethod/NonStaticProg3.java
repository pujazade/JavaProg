package NonStaticMethod;

	// 2. Non-Static method without parameter in same class

public class NonStaticProg3 {
	public void method1()
	{
		System.out.println("Hi,Good morning!");
		System.out.println("I practice the program on daily basis.");
		System.out.println("So, my concept are cleared now. ");
	}
	public void mockmethod()
	{
	    System.out.println("Hi, we arrange our mock group");
		System.out.println("We create a one leader from our group");
		System.out.println("Leader decided what topic we going to study");
		System.out.println("After every 15 days we change our leader");
		System.out.println("By which everyone will get the chance to lead the group");
	}
	public static void main(String[] args) {
		NonStaticProg3 a = new NonStaticProg3();                  //ref.variable or object seprately give to the method call
		a.method1();
		System.out.println("-----------------------------");			
		NonStaticProg3 abc = new NonStaticProg3();
		abc.mockmethod();
			
		System.out.println("******************************");   
		NonStaticProg3 xyz = new NonStaticProg3();              //only one object or ref.variable using both methods calling.
		xyz.method1();
		xyz.mockmethod();
			
			
		}
}
