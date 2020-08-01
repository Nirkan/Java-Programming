
// Simplifying if Statements & Ternary operator


class Main{

	public static void main(String[] args){

		int income = 120_000;


		boolean hasHighIncome = (income > 100_000);                         // Simplified if Statement


		String className = income > 100_000 ? "First" : "Economy";           // Ternary Operator
	
		
		System.out.println(hasHighIncome);


		System.out.println(className);

	
	
	}



}
