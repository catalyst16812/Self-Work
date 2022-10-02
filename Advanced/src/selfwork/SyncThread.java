package selfwork;

class count{
	int count;
	public synchronized void counter(){//by using syncronised we make the threads access the count one by one
		count++;
	}
}
public class SyncThread  {
	public static void main(String[] args) throws Exception {
		count num = new count();
		
		Thread t1 = new Thread (()->{
			for(int i=0;i<1000;i++)
			num.counter();
		});
		Thread t2 = new Thread (()->{
			for(int i=0;i<1000;i++)
			num.counter();
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("count is "+num.count);
	}

}
