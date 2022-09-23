package selfwork;

class Calculator  //Super
{
	public int add(int i,int j)
	{
		return i+j;
	}
}

class CalcAdv extends Calculator  //Sub
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcAdv c1 = new CalcAdv();
		int result = c1.add(1,5);
		System.out.println(result);
		result = c1.sub(5, 1);
		System.out.println(result);
	}

}
