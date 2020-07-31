
// Casting and type conversion


class Main{

	public static void main(String[] args){


		short x = 1;

		int y = x + 2;              // Implicit casting


		double x1 = 1.1 ;

		double y2 = x1 + 2;           // Automatically cast integer to double

		
		double x2 = 1.1;

		int k = (int) x2;	

		int y3 = k + 4;


		String x3 = "1";

		int y4 = Integer.parseInt(x3) + 5;

		System.out.println(y);

		System.out.println(y2);

		System.out.println(y3);

		System.out.println(y4);


	}

}
