import java.util.Scanner;

class HelloWorld {

	public static void main (String[] args) {
		Scanner toetsenbord = new Scanner(System.in);
		
		System.out.print("Hoe heet je? ");
		String naam = toetsenbord.next();

		toetsenbord.close();

		System.out.println("Hello " + naam + "!");
	}

}