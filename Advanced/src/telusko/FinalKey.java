package telusko;
class Aa{
	final int NUM;
	public Aa()
	{
		NUM=10;
	}
	public void show()
	{
		System.out.println("in final class");
	}
	final public void showfinal()
	{
		System.out.println("in final class showfinal()");
	}
}

class Bb extends Aa
{
//	void showfinal()        final method cannot be overrided
//	{
//		
//	}
}

public class FinalKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
		
		Bb obj1 = new Bb();
		obj1.show();
		obj1.showfinal();
	}

}
