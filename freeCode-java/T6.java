
import java.util.Scanner;

class Main{


	public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);

	String s = sc.nextLine();


	if (s.equals("bill")) {


		System.out.println("You are bill.");

		
	} else if (s.equals("hello")) { 


		System.out.println("Hi there");


	} else if (s.equals("hi")) {


		System.out.println("hello there");


	} else {


		System.out.println("Try to type bill or hello or hi");


	}


    }


}
