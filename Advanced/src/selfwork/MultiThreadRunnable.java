package selfwork;

class even implements Runnable{

	int arr[] = new int[50];
	int size;
	public even(int arr[],int size)
	{
		this.arr = arr;
		this.size = size;
	}
	public void run() {
		for (int i =0 ;i<size;i++) {
			if(arr[i]%2 == 0)
				{System.out.println(arr[i]+"is even");
				 try{Thread.sleep(500);}catch(Exception e){}
				}
		}
	}
	
}
class odd implements Runnable{

	int arr[] = new int[50];
	int size;
	public odd(int arr[],int size)
	{
		this.arr = arr;
		this.size = size;
	}
	public void run() {
		for (int i =0 ;i<size;i++) {
			if(arr[i]%2 != 0)
				{System.out.println(arr[i]+"is odd");
				 try{Thread.sleep(500);}catch(Exception e){}
				}
		}
	}
	
}
class divisible implements Runnable{
	
	int arr[] = new int[50];
	int size;
	public divisible(int arr[],int size)
	{
		this.arr = arr;
		this.size = size;
	}
	public void run() {
		for(int i=0;i<size;i++)
			if(arr[i]%5 ==0)
				System.out.println(arr[i]+"is divisible by 5");
				try{Thread.sleep(500);}catch(Exception e) {}
	}
}

public class MultiThreadRunnable {
	
public static void main(String[] args)  {
	int arr[] = new int[] {12,45,85,15,89,40,20,14,24,53,45,14,55,12,695,523,58,69,125,35,78,25,667,35,215};
	Runnable obj1 = new odd(arr,arr.length);
	Runnable obj3 = new even(arr,arr.length);
	Runnable obj2 = new divisible(arr,arr.length);
	
	Thread t1 = new Thread(obj1);
	Thread t2 = new Thread(obj2);
	Thread t3 = new Thread(obj3);

	t1.start();
	t2.start();
	t3.start();
}
	
}
