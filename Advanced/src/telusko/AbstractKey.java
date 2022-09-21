package telusko;

abstract class Human{
	public abstract void eat();
	
	public void walk()
	{
		
	}
}
class Man extends Human
{

	public void eat() 
	{
		
	}
	
}

public class AbstractKey 
{

	public static void main(String[] args) 
	{
		Human obj = new Man();
	}

}
