package selfwork;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CheckedException {
	public static void main(String[] args) throws IOException {
		System.out.println("Input a Number");
		BufferedReader br =null;
		int a =0 ;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			a= Integer.parseInt(br.readLine());
		}
		catch (Exception e) {
			System.err.println("Cannot take input other then integer");
		}
		finally {
			System.out.println("The input number was "+a);
			br.close();
		}
	}
}
