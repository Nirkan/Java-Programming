
import java.util.Scanner;

class Main{


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Type a number : ");

		int x = sc.nextInt();


		int count = 0;          // while loop

		while (x != 10) {

			
			System.out.println("Type 10...");
			
			System.out.print("Type a number : ");

			x = sc.nextInt();			



		}

		System.out.println("You tried " + count + " times");


		// do while loop		
		
		//int x;

		do {
		
			System.out.print("Type a number : ");

			x = sc.nextInt();


		} while (x != 10);



	}



}
