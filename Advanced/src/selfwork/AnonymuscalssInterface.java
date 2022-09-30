package selfwork;

interface Abc{
	void show();
}




public class AnonymuscalssInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abc obj = new Abc() {
									public void show() 
									{
									System.out.println("In Anonymus class");
									}
							};
							
		obj.show();
	}

}
