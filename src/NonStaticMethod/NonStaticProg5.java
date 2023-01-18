package NonStaticMethod;
                              //2. Non-Static method with parameter in same class

public class NonStaticProg5 {
     public void multiply1(int a, int b)
     {
      int result;
      result = a*b;
      System.out.println("Multiply the two values ="+ result);
     }
     public void multiplyThreeNum(int num1,int num2,int num3)
     {
      int result;
      result = num1*num2*num3;
      System.out.println("Multiplication of three numbers ="+ result);

     }
      public void muNum(int num1,int num2)
     {
      int r;
      r = num1/num2;
      System.out.println("Dividation of two numbers ="+ r);

      }

      public static void main(String[] args) {
      NonStaticProg5 d = new NonStaticProg5();
      d.multiply1(10, 20);
      d.multiplyThreeNum(10, 10, 10);
      d.muNum(20,2);

    }

}



