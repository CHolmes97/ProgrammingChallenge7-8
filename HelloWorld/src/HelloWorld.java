import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello World!!!!!");
		
		System.out.println("Enter Name: ");
		String name = keyboard.nextLine();
		
		System.out.println("Goodbye cruel world!");
	}

}
