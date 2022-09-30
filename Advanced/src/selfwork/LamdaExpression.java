package selfwork;

interface Display
{
	void display();
}
public class LamdaExpression {
	
	public static void main(String[] args) {
	

		Display obj = ()-> System.out.println("Display of lamda, functional interface");
		
		obj.display();
	}
	
}
