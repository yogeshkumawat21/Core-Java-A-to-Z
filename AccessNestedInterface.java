interface A
{
   void a();
   interface  B
   {
      void b();

   }
}
class C implements A.B{
  public void b()
   {
      System.out.print("b interface accessed");
   }
}
public class Main
{
   public static void main(String[] args) {
      A.B obj = new C();
      obj.b();
   }
}
