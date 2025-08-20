class A
{
    public A()
    {
        super(); //by default method in all constructors
        System.out.println("In A constructor");
    }
    public A(int n)
    {
        super();
        System.out.println("In A para constructor");
    }
} 
class B extends A
{
    public B()
    {
        super();
        System.out.println("In B constructor");
    }
    public B(int n)
    {
        super(n);
        System.out.println("In B para constructor");
    }
} 

public class constructor1 {
    public static void main(String[] args) 
    {
        B obj = new B(5);
    }
    
}
