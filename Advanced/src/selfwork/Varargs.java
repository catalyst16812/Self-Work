package selfwork;
class Cale{
	

public int  Add(int ... a)
{
	int sum = 0;
	 for(int i : a)
	 {
		 sum = sum+i;
	 }
	 return sum;
}

public void output(int op)
{
	System.out.println("Sum is "+op);
}
}
public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {1,2,3,4,5};
		
		Cale numbers = new Cale();
		numbers.output(numbers.Add(arr));
		
	}

}
