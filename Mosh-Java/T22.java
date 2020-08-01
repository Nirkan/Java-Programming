
// While loop  ;  do while loop


import java.util.Scanner;

class Main{

	public static void main(String[] args){

		int i = 0;

		while (i > 0) {


			System.out.println("Hello World" + i);
		
			i--;

		}


		
		String input = ""; 

		Scanner scanner = new Scanner(System.in);


		while (!input.equals("quit")) {

			System.out.println("Input : ");

			input = scanner.next();
			
			if (intput.equals("pass"))

				continue;

			if (input.equals("quit"))

				break;

			System.out.println(input);



	
		}



		do {

			System.out.println("Input : ");

			input = scanner.next();

			if (input.equals("quit"))

				break;

			System.out.println(input);



		} while (!input.equals("quit"));





	}



}
