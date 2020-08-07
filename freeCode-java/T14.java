
import java.util.Scanner;

class Main{


	public static void main(String[] args){        // This is a method here


	Scanner sc = new Scanner(System.in);   // sc is object or instance here

	// sc.next();        // method next

	String h = "hello";  // object

	h.length();         // method length


	joy("Happy", 5);       // call statement


	System.out.println(add2(6));


	System.out.println(str("Hey there"));

	}


	public static void joy(String str, int x) {          // This is another method in class Main

	for (int i = 0; i < x; i++){

		System.out.println(str);

	
		}
	}



	public static int add2(int x) {     // in this method we return int instead of void.

		return x+2;



	}



	public static String str(String x) {



		return x + "!";


	}




}
