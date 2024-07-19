class A
{
   static class B
   {

        public B() {
         System.out.println("B Accessed");
        }
      
   }
}
public class Main
{
   public static void main(String[] args) {
     A.B obj = new A.B();
     
   }
}
