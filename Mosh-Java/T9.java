
// Multi-dimensional array


import java.util.Arrays;

class Main{

	public static void main(String[] args){


		int[][] numbers = new int[2][3];

		int[][][] numbers3 = new int[2][3][5];

		int[][] numbers2 = {{1,2,3},{4,5,6}};

		numbers[0][0] = 1;

		System.out.println(Arrays.toString(numbers));

		System.out.println(Arrays.deepToString(numbers));
		
		System.out.println(Arrays.deepToString(numbers2));

		System.out.println(Arrays.deepToString(numbers3));


	}


}
