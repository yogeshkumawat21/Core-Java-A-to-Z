class A extends Exception
{
    public A(String s)
    {
        super(s);
    }
}

public class Main 
{
    public static void main(String[] args) {
        try
        {
            throw new A("Yogesh");
            
        }
        catch(Exception e)
        {
            System.out.println(e);

        }      
    }
}
