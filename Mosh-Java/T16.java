
// Comparision Operators and logical operators


class Main{

	public static void main(String[] args){

		int x = 1;

		int y = 1;

		int temperature = 22;

		boolean isWarm = temperature > 20 && temperature < 30;


		boolean hasHighIncome = false;

		boolean hasGoodCredit = true;

		boolean hasCriminalRecord = false;

		boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;



		System.out.println(x == y);

		System.out.println(x != y);

		System.out.println(x <= y);

		

		System.out.println(isWarm);

		System.out.println(isEligible);



	}

}
