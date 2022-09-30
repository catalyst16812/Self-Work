package selfwork;

interface statinter{
	int num = 10;
	void abc();

	static void clean(){
		System.out.println("Inside static interface");
	}
}

class interstatic implements statinter{


	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("num = "+num);

	}

	
	
}
public class StaticInterface {
public static void main(String[] args) {
	statinter.clean();
	interstatic obj = new interstatic();
	obj.abc();
}
}
