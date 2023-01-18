package NonStaticMethod;
	//3. Non-Static method with parameter in different class
	public class NonStaticProg6 {

	public static void main(String[] args) {
	   NonStaticProg5 a = new NonStaticProg5();     //with parameter
	   a.multiplyThreeNum(5, 5, 5);
       System.out.println("*******");
	   a.muNum(2, 2);
	     
	     
	   System.out.println("------------------");    //without parameter
       NonStaticProg1 b = new NonStaticProg1();
	   b.method1();
	     

    }
}