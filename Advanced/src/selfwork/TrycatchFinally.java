package selfwork;

public class TrycatchFinally {
public static void main(String[] args) {
	try {
		int i =10;
		int k =0;
		k = i/0;
		
	}
	catch(Exception e){
		System.out.println("Error "+e);
	}
	finally {
		System.out.println("Final Messege");
	}

	try {
		int i =9;
		int arr[] = null;
	//	System.out.println(i/0);
		System.out.println(arr[20]);}
	catch(ArithmeticException e){
	System.out.println("Cannot divide by 0");
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Unable to reach that code");
	}
	catch(Exception e) {
		System.err.println("unknown error : "+e);
	}
	finally {
		System.out.println("Bye");
	}
}
}
