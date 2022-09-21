package telusko;
class Fir
{
	public void show()
	{
		System.out.println("in A");
	}

}

class Sec extends Fir
{
	@Override
	public void show()
	{	
		System.out.println("in B");
	}
	public void config()
	{	
		System.out.println("config");
	}
}

class Thi extends Fir
{
	public void show()
	{	
		System.out.println("in C");
	}
	
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fir obj1 =new Sec();  //runtime polymorphism
		obj1.show();
		
		obj1 = new Thi();		//Dynamic Method Dispatch
		obj1.show();
	}

}
