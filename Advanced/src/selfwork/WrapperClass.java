package selfwork;

//int , float , double
//Integer
public class WrapperClass {

	public static void main(String[] args) {
		
		int a =5; //primitive
		
		Integer b = new Integer(5); //Wrapping,Boxing
		
		a = b.intValue(); //unboxing
		
		Integer c =a;	//autoboxing

		int d =c;  //auto unboxing
		
		String number = "95405";
		
		int n = Integer.parseInt(number);
		System.out.println(n);
	}

}
