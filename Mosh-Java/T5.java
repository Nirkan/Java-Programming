
import java.awt.*;


class Main {

	public static void main(String[] args){


	    /*  byte x = 1;
		byte y = x;
		x = 2;
		
		System.out.println(y);  */


		byte x = 1;

		byte y = 1;


		Point point1 = new Point(byte x, byte y);

		Point point2 = point1;

		point1.x = 3;

		System.out.println(point2);

		

		// Reference types are copied by their reference.
		// Primitive types are copied by their value.


	}

}
