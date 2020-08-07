

public class T17 {



	protected static int count = 0;


	protected String name;

	protected int age;


	public T17(String name, int age){

		this.name = name;
		
		this.age = age;

		T17.count += 1;


	}


	
	public static void main(String[] args){

		T17 tommy = new T17("tommy", 9);


		T17 jonny = new T17("jonny", 7);

		
		System.out.println(T17.count);

		
		T17.display();


	
	}


	
	public static void display() {


		System.out.println("Tommy am a dog!");



	}





}
