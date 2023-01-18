package NonStaticMethod;
                         // 2. Non-Static method without parameter in different class
public class NonStaticProg4 {

     public static void main(String[] args) {    //different class used only main method
       NonStaticProg3 ss = new NonStaticProg3();
       ss.method1();
       System.out.println();
       ss.mockmethod();

       System.out.println("***************************");
       NonStaticProg1 pp = new NonStaticProg1();
       pp.method1();

       }

}

	
	


