package selfwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedInput {
public static void main(String[] args) throws Exception {
	System.out.println("Input a number");
	
int a = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
	System.out.println("Input another number");
int b = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
	System.out.println("The sum of these two number is "+(a+b));
}
}
