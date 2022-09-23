package selfwork;
class Emp{

	int salary;
	int eid;
	static String ceo;

	static {
		ceo="Jonathan";
	}
	
	static {
		System.out.println("hello");
	}
	public Emp() {
		salary = 30000;
		eid = 25;
		}



	public void show()
	{
		System.out.println(eid+" : "+salary+" : "+ceo);
	}

}

public class StaticKeyword {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp Mohan = new Emp();
		Mohan.show();
		
		Emp nikhil = new Emp();
		nikhil.eid = 20;
		nikhil.salary = 4000;
		nikhil.ceo="Mukesh";
		
		Emp sumit = new Emp();
		sumit.eid = 20;
		sumit.salary = 4000;
		sumit.ceo="Amit";
		
		Emp change= new Emp();
		change.ceo="Pooja";
		
		
		nikhil.show();
		sumit.show();
	}

}
