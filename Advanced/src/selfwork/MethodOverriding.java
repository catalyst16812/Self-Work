package selfwork;
class First
{
	public void show()
	{
		System.out.println("in A");
	}

}

class Second extends First
{
	@Override
	public void show()
	{	
		super.show();
		System.out.println("in B");
	}
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Second obj1 =new Second();
		obj1.show();
	}

}
