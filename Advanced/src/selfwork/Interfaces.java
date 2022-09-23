package selfwork;

interface writer2{
	public void write();
}

class keyboard implements writer2{

	@Override
	public void write() {
		System.out.println("Writing with keyboard");
		
	}
	
}

class hand implements writer2 {

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Writing with hand");
	}
	
}

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writer2 p = new keyboard();
		writer2 pp = new hand();
		
		p.write();
		pp.write();
	}

}
