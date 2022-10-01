package selfwork;



public class TryWithResources 
{
	public static void main(String[] args) 
	{
		
			int a = 4;
			int b = 24;
			try
			{
			int c = a/b;
			
			if(c == 0 ) 
				throw new Myexception("This is not possible cannot go below 1");
				System.out.println(c);
			}
			
			catch(Myexception e)
			{
				System.out.println("Erroar " + e.getMessage());
			}

		
	}
}


