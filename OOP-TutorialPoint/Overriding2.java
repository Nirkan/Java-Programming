
class Animal {

	public void move() {

		System.out.println("Animals can move");

	}

}



class Dog extends Animal {

	public void move() {

		System.out.println("Dogs can walk and run");

	}

	public void bark() {

		System.out.println("Dogs can bark");

	}

}



class TestDog {

	public static void main(String args[]) {

		Animal a = new Animal();  // Animal reference and object

		Animal b = new Dog();     // Animal reference but Dog object

		Dog d = new Dog();        // Dog reference and dog object.


		a.move();    // runs the method in Animal class.

		b.move();    // runs the method in Animal class.

		// b.bark();    Gives error since Animal doesn't have method bark

		d.bark();    // runs the method in Dog class.

	}

}
