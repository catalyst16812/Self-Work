package selfwork;

abstract class Writer{
	
	public abstract void write();
	
}

class pen extends Writer{

	@Override
	public void write() {
		System.out.println("Writing characters with pen");
		
	}
	
}

class pencil extends Writer{

	@Override
	public void write() {
		System.out.println("Writing numbers with pencil");
		
	}
	
}

public class AbstractExrsice {

	public static void main(String[] args) {
		
		Writer obj1 = new pen();
		
		obj1.write();
		
		obj1 = new pencil();
		
		obj1.write();

	}

}
