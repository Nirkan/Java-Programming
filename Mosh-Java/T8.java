
// Arrays


import java.util.Arrays;

class Main{

	public static void main(String[] args){

		int[] numbers = new int[5];
		
		numbers[0] = 1;
		
		numbers[1] = 2;

		numbers[2] = 3;


		int[] numbers2 = {2, 3, 5, 1, 4};

		Arrays.sort(numbers2);


		System.out.println(numbers);

		System.out.println(Arrays.toString(numbers));

		System.out.println(numbers2.length);		



	}


}
