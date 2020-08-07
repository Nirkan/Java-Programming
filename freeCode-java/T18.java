

class Student implements Comparable<Student>{

	private String name;


	public Student(String name){

		this.name = name;

	}


	public boolean equals(Student other){

		if (this.name == other.name){

			return true;

		} else {

			return false;

		}


	}



	public int compareTo(Student other){


		return this.name.compareTo(other.name);


	}



	
	public String toString() {


		return this.name;


	}






	public static void main(String[] args){



		Student joe = new Student("Joe");

		Student bill = new Student("Bill");

		Student krill = new Student("Krill");



		System.out.println(joe.equals(bill));


		System.out.println(joe.compareTo(bill));
		

		System.out.println(joe.compareTo(bill) > 0);

		
		System.out.println(krill);


	}


}
