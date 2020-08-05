

public class T5{

	public static void main(String[] args){


	int x = 6;

	int y = 7;

	int z = 10;

	String a = "hello";

	String b = "hi";


	// comparison operators :  > < == >= <= !=  

	boolean compare = x < y;

	boolean compare2 = x >= y;

	boolean compare3 = x == y;

	boolean compare4 = x < y && z > y;

	boolean compare5 = !(x > y && z > y);       // ! NOT Operator

	boolean compare6 = (x < y && y > z) || (z + 4 < 5 || y + 3 > y);
  
	System.out.println(compare);

	System.out.println(compare2);

	System.out.println(compare3);

	System.out.println(compare4);

	System.out.println(compare5);

	System.out.println(compare6);


	}

}
