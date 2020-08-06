
import java.util.Scanner;

class Main{


	public static void main(String[] args){

	int[] arr = {1,5,7,3,4,5};

	for(int i= 0; i < arr.length; i++) {

		if (arr[i] == 5){		

		System.out.println("Found a 5! at index " + i);

		}


	}
   

	String[] names = new String[5];

	for (int element:arr) {

	
		System.out.println(element);

	}



	int count = 0;

	for (int element:arr) {


		System.out.println(element + " " + count);

		count ++;

	}



	Scanner sc = new Scanner(System.in);


	for (int i = 0; i < names.length; i++) {


		System.out.print("Input : ");

		String input = sc.nextLine();

		names[i] = input;



	}



	for (String n:names) {


		System.out.println(n);

		if (n.equals("nir")){
		
			break;

		}


	}



   }



}
