package selfwork;



public class Multithreadlamda {
	
public static void main(String[] args)	throws Exception  {
	int arr[] = new int[] {12,45,85,15,89,40,20,14,24,53,45,14,55,12,695,523,58,69,125,35,78,25,667,35,215};

					
	
	Thread t1 = new Thread( ()-> {
		for (int i =0 ;i<arr.length;i++) {
			if(arr[i]%2 == 0)
				{System.out.println(arr[i]+"is even");
				 try{Thread.sleep(500);}catch(Exception e){}
				}
		}
	});
	Thread t2 = new Thread(()-> {
		for (int i =0 ;i<arr.length;i++) {
			if(arr[i]%2 != 0)
				{System.out.println(arr[i]+"is odd");
				 try{Thread.sleep(500);}catch(Exception e){}
				 }
		};
	});
	Thread t3 = new Thread(()-> {
		for(int i=0;i<arr.length;i++)
			if(arr[i]%5 ==0) {
				System.out.println(arr[i]+"is divisible by 5");
				try{Thread.sleep(500);}catch(Exception e) {}
			}
	});
	
	t1.setPriority(Thread.MIN_PRIORITY);
	t2.setPriority(10);
	t3.setPriority(5);
	t1.start();
 	t2.start();
	t3.start();
	
	t1.join();
	
	System.out.println("---------------------------t1 is now finished");
	t2.join();
	
	System.out.println("---------------------------t2 is now finished");
	t3.join();
	
	System.out.println("---------------------------t3 is now finished");
}
}
	

