   package StaticMethod;    //static method with parameters in one class ====>(for three numbers  addition)

	public class Prog4 {

		public static void addThreeNumbers()            //without parameter            //Userdefined/Predefined
		{
			int a=10,b=20,c=5,sum=0;
		    sum=a+b+c;
		    System.out.println("Addition of Three numbers="+sum);
		    System.out.println("--------------------------------------------");
		    
		}
		
		public static void add3NumbersUsingParameters(int p,int q,int r)       //withparameter //userdefined method/Predefined
		{
			int result=0;
			result=p+q+r;
			System.out.println("Addition of Three numbers with parameters = "+result);
			System.out.println();
		}

		public static void main(String[] args) {                             //main method 
	        addThreeNumbers();                                               //without parameter
			add3NumbersUsingParameters(100, 20,10);                          //with parameter
		}

	


	}


