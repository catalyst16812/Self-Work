package selfwork;

class Defined{
	
	public void print() 
	{
		System.out.println("printing in class Defined");
	}
	public void show() 
	{
		
	}
	
	public void sum(int[] a){
		int total =0;
		for(int k : a)
		{
			total+=k;
		}
		System.out.println("sum is "+total);
	}
}

public class AnonymusClass {
	public static void main(String[] args) {
	
	Defined obj = new Defined()
					{
							public void show() 
							{
							System.out.println("Showing anonymus class in Defined");
							}
					};
		obj.print();
		obj.show();
		obj.sum(new
				int[]{1,2,3,4,5,6,7,8,9,10}); //anonymus array
			
			
}
}
