
class Animal {

	public void move() {

		System.out.println("Animals can move");

	}

}



class Dog extends Animal {

	public void move() {

		super.move();    // invokes the super class method

		System.out.println("Dogs can walk and run");

	}

}


class TestDog {


	public static void main(String args[]) {

		Animal d = new Dog();    // Animal reference but Dog class

		d.move();     // runs the method on Dog class.


	}


} 
