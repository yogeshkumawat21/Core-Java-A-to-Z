class A
{
   int a =20;

   class B
   {
      B()
      {
         System.out.print(a);
      }
   }
   
}

public class Main 
{
   public static void main(String[] args)
   {
          A a = new A();
          A.B b = a.new B();

   }
}

