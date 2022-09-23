package selfwork;

class outer{
	
	int a ;
	public void show() {
		System.out.println("Inside outer class");
		
	}
	
	class inner{
		
		public void display() {
			System.out.println("Inside inner class");
		}
	}
	
	static class innerstatic{
		public void display() {
			System.out.println("inside static inner class");
		}
	}
}

public class Innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		outer obj = new outer();
		obj.show();
		
		outer.inner obj1 = obj.new inner();
		
		obj1.display();
		
		outer.innerstatic obj2 = new outer.innerstatic();
		obj2.display();
	}

}
