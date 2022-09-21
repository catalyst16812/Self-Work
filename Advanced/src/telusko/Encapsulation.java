package telusko;

class Student{
	private int roll;
	private String name;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class Encapsulation {

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		
		s1.setName("Nikhil");
		s1.setRoll(93);
		System.out.println("Roll Number is"+s1.getRoll());
		System.out.println("Name is "+s1.getName());
	}

}
