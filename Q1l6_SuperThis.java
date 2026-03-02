class A{
    A()
    {
        this(20);
        System.out.println("Default A");
    }
    A(int i)
    {
        super();
        System.out.println("A "+i);
    }
}

class B extends A
{
    B()
    {
        this(10);
        System.out.println("Default B");
    }
    B(int i)
    {
        super();
        System.out.println("B "+i);
    }
}

public class Q1l6_SuperThis {
    public static void main(String[] args) {
        B b=new B();
    }
}
