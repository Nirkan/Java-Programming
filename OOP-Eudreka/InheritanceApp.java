

// Textual Representation how an object will look like in the memory.

// Whatever we write in class is in actual the property of object.

// If we want anything which should belong to class make it static !!




class Product {


	// Attribues (State)

	int pid;

	String name;

	int price;



	// Constructer

	Product(){
	
		System.out.println(">> Data Written in Product Object");

	}


	
	// Methods (Behaviour)

	// To write data in Product object we have in this Method

	void setProductDetails(int pid, String name, int price){

		this.pid = pid;

		this.name = name;

		this.price = price;
	
	}


	

	void showProductDetails(){

		System.out.println("------Product ID: "+pid+"-------");

		System.out.println("Name:\t" + name);

		System.out.println("Price:\t"+price);

		System.out.println("---------------");


	}


	// Setters and Getters are used when the Attribute is declared private.
	
	// Setter

	void setPid(int pid){

		this.pid = pid;   // this means reference to current object

		// LHS belongs to the Object and RHS belongs to method

	}


	// Getter

	int getPid(){

		return pid;

	}


}






class Mobile extends Product{  // IS-A Relation, Mobile IS-A Product, Mobile is a Child, Product is the parent.

	// Additional Attributes of Mobile other than the Product

	String os;
	
	int ram;

	int sdCardSize;


	// Constructer

	Mobile(){

		System.out.println(">> Mobile Object Constructed");

	}


	// We have redefined the same method form the parent into the child with differnt arrtibutes.
	// We have now 2 methods in the child, 1 from Parent and 1 from child.
	
	// METHOD OVERLOADING : Same Method name with different inputs.

	void setProductDetails(int pid, String name, int price, String os, int ram, int sdCardSize){

		this.pid = pid;

		this.name = name;

		this.price = price;

		this.os = os;

		this.ram = ram;

		this.sdCardSize = sdCardSize;
	
	}



	// Lets Redefine showProductDetails as well.
	// But here we have same inputs
	// 2 methods, 1 from parent 1 in the child and we have same signatures !!
	// Child methods will be executed and not the parent method.


	// METHOD OVERRIDING : Same method name with same input in parent child relationship.
			
	void showProductDetails(){

		System.out.println("------Product ID: "+pid+"----------");

		System.out.println("Name:\t" + name);

		System.out.println("Price:\t"+price);

		System.out.println("OS:\t"+os);

		System.out.println("ram:\t"+ram);

		System.out.println("SDCard:\t"+sdCardSize);

		System.out.println("--------------------------------");


	}

	
	

}





public class InheritanceApp {


	// main is executed by JVM when my program will run !!


	public static void main(String[] args){


/*

		// Create an Object : Product

		Product product1 = new Product();

		// product1 is not an object its a reference variable which holds the hashCode of the object in hexadecimal notation.

		System.out.println("product is: "+ product1);

		// Writing data in Object

		product1.setProductDetails(101, "iPhoneX", 80000);

		
		// Reading data from Object

		product1.showProductDetails();


		// Lets write the data directly

		Product product2 = new Product();

		product2.setPid(201);              // Attributes marked as private cannot be accessed.

		product2.name = "Nike Shoes";

		product2.price = 5000;

		product2.showProductDetails();


*/


		

		// Requesting to get Mobile Object Constructed !!

		Mobile mobile = new Mobile();


		// We can access whatever there was in the parent Product into the chid mobile.

		//mobile.setProductDetails(301, "iPhoneX", 70000);

		//mobile.showProductDetails();

		mobile.setProductDetails(301, "iPhoneX", 70000, "iOS", 4, 128);

		mobile.showProductDetails();



	}


}
