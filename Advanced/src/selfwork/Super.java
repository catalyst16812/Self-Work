package selfwork;

class A{
	
	public A()
	{
		System.out.println("in A");
	}
	public A(int i)
	{
		System.out.println("in A int");
	}
}

class B extends A{
	public B()
	{	super(5);
		System.out.println("in B");
	}
	public B(int i)
	{
		super(i);
		System.out.println("in B int");
	}
}

public class Super {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A def1 = new A();
		System.out.println("a constructor");
		B def2 = new B();
		System.out.println("b constructor");
		System.out.println();
		A int1 = new A(5);
		System.out.println("a in constructor");
		B int2 = new B(5);
		System.out.println("b in constructor with super() in the int constructor , without super 'in a int' will not be called");
		B def3 = new B();
		System.out.println("b constructor with super() in the constructor");
	}

}
