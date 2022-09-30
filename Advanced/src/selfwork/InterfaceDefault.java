package selfwork;

interface Inter{
	void first();
	default void second(){
		System.out.println("inside second");
	}
}

class defInter implements Inter {
	@Override
	public void first() {
		// TODO Auto-generated method stub
		System.out.println("inside First");
	}
	
	public void third() {
		System.out.println("inside Third");
	}
}

public class InterfaceDefault {

	public static void main(String[] args) {
		defInter obj = new defInter();
		
		obj.first();
		obj.second();
		obj.third();
		
		Inter obj2 = ()->
		
		{System.out.println("inside first");
		};
		
		obj2.first();
		obj2.second();
	}
}
