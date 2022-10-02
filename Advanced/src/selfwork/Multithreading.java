package selfwork;

class sum	extends Thread{
	public void run() 
	{for(int i=0;i<10;i++) {
		System.out.println("adding "+i);
		try{Thread.sleep(500);}catch(Exception e){}
	}
	}
}
class multi extends Thread{
	public void run()
	{	for(int i=0;i<10;i++) {
		System.out.println("Multiplying "+i);
		try{Thread.sleep(500);}catch(Exception e){}
	}

	}
}

public class Multithreading {
	public static void main(String[] args) {
		sum s = new sum();
		multi m = new multi();
		
		s.start();
		m.start();
	}

}
