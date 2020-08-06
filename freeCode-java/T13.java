
import java.util.Map;

import java.util.HashMap;


import java.util.Arrays;

class Main{


	public static void main(String[] args){


		Map m = new HashMap();

		String str = "hello there how are you doing";

		System.out.println(str.toCharArray());

		for (char x:str.toCharArray()) {

			if (m.containsKey(x)){

				int old = (int) m.get(x);

				m.put(x, old+1);

			} else {
			
				m.put(x, 1);

			}


		}

		m.remove(' ');
	
		System.out.println(m);


		// Sorting

		
		int[] x = {-99, 5, 4, 3, 2, 12, 11, 15, 13, 1};


		Arrays.sort(x, 1, 7);


		for(int i:x){

		
			System.out.print(i + ",");


		}






	}


}
