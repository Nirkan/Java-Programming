

class Main{


	public static void main(String[] args){


	
		Car ford = new Car();

		ford.speedUp(10);

		ford.changeGear(2);

		ford.display();

		
		int x = Vechile.math(5);

		System.out.println(x);




	}


}





interface Vechile {

	final int gears = 5;


	void changeGear(int a);

	void speedUp(int a);

	void slowDown(int a);

	
	default void out(){

		System.out.println("Default method");

	}


	static int math(int b){

		return b + 9;
	

	}

}







class Car implements Vechile{

	     


		int gear = 1;
		
		int speed = 0;



	      public void changeGear(int gear){


			this.gear = gear;


		}


	       public void speedUp(int change) {

			this.speed += change;


		}



	       public void slowDown(int change){
			
			this.speed -= change;


		}


		
		public void display() {

		
			System.out.println("I am a car, going " + this.speed + " km/h and I am in gear " + this.gear);

			out();


		}





	}


