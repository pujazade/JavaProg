package StaticMethod;    //static method with parameters in different class ====>(for three numbers  addition)
                         //without main method
public class Prog5 {
	public static void hpInfo(String name,String surname,int age,String school,String city,double salary,char grade,String dob)
    {
		System.out.println("NAME ="+name);
		System.out.println("SURNAME ="+surname);
		System.out.println("AGE="+age);
		System.out.println("SCHOOL NAME ="+school);
		System.out.println("CITY NAME ="+city);
		System.out.println("Salary =" + salary);
		System.out.println("GRADE ="+grade);
		System.out.println("DATE OF BIRTH="+dob);
	}
	public static void sum(int a,int b) //a=100,b=200  //parameters or arguments or signatures
	{
		int c = 0;
		c = a+b;
		System.out.println("Addition of Two Numbers with parameters =" +c);
	}
		
}

	