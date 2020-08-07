
// T15 is the class name for Dogs.

public class T16 {


	public String name;      // Attributes

	public int age;

	public T16 (String name, int age) {

		this.name = name;

		this.age = age;

		add2();
		


	}

	

	public void speak(){


		System.out.println("I am " + this.name + " and I am " + this.age);


	}


	
	public int getAge() {


		return this.age;


	}



	public void setAge(int age) {

		this.age = age;


	}



	private int add2(){

		return this.age + 2;


	}


	// main function

	public static void main(String[] args) {


		T16 scooby = new T16("scooby", 7);            // T16 is a Dog class

		scooby.speak();

		int x = scooby.getAge();

		System.out.println(x);

		scooby.setAge(10);

		scooby.speak();


		Cat kitty = new Cat("kitty", 18, 100);

		kitty.speak();


		Cat malu = new Cat("malu",8);

		Cat joe = new Cat("joe");


		malu.speak();

		joe.speak();


	}

}





// Child class Cat of parent class T16



class Cat extends T16 {

	private int food;


	public Cat(String name, int age, int food){

		super(name, age);

		this.food = food;


	}



	public Cat(String name, int age){

		super(name, age);
		
		this.food = 50;


	}


	public Cat(String name){


		super(name, 0);

		this.food = 50;


	}


    
       public void speak(){

		System.out.println("Meow My name is " + this.name + " and I get fed " + this.food);


	}


	public void eat(int x) {


		this.food -= x;


	}

}
