package StaticMethod;
                 //3.STATIC METHOD WITHOUT & WITH PARAMETERE FROM SAME CLASS 
public class Prog3 {
	public static void add()                                                                //PREDEFINED METHOD OR USER METHOD //WITHOUT PARAMETER
	{
		int a=10,b=20,c=0;
		c=a+b;
		System.out.println("Addition of two numbers without parameter = " +c);
		System.out.println();
	}
	
	public static void sum(int g, int h) //parameter or argument or signature                  //WITH PARAMETER
	{
		int d=0;
		d=g+h;                           //g=100 and h=200
		System.out.println("Addition of two numbers with parameter =" +d);
		System.out.println();
	}
 
	public static void GitaInfo(String name, int empId,double salary,String city,char grade)   // ANOTHER  WITH PARAMETER
	{
		System.out.println("Employee Name =" +name);
		System.out.println("Employee ID =" +empId);
		System.out.println("Employee Salary =" + salary);
		System.out.println("Employee city name =" +city);
		System.out.println("Employee Grade =" +grade);
	}
	
	public static void main(String[] args) {                                                //MAIN METHOD
	add();                                                                                  // WITHOUT PARAMETER CALL
	sum(100,200);                                                                           // WITH PARAMETER CALL
	GitaInfo("Gita", 101, 99000.99,"Mumbai", 'A');                                          //with parameter

	}
}
