
import java.util.Set;

// import java.util.Scanner;

import java.util.HashSet;

import java.util.LinkedHashSet;

import java.util.ArrayList;

class Main{


	public static void main(String[] args){


		// Sets

		Set<Integer> t = new HashSet<Integer>();

		t.add(5);
	
		t.add(7);

		t.add(5);

		t.add(9);

		t.add(-8);

		t.remove(9);

		// t.clear();
		
		t.size();

		boolean x = t.contains(5);


		Set<Integer> k = new LinkedHashSet<Integer>();

		k.add(5);
	
		k.add(7);

		k.add(5);

		k.add(9);

		k.add(-8);

		k.remove(9);



		System.out.println(t);

		System.out.println(x);

		System.out.println(k);



		// Lists

	
		ArrayList<Integer> p = new ArrayList<Integer>();

		p.add(1);

		p.add(2);

		int q = p.get(0);

		p.add(4);

		p.add(7);

		p.add(11);

		p.add(9);

		p.set(1, 5);

		p.subList(1,3);


		System.out.println(p);

		System.out.println(q);

		System.out.println(p.subList(1,3));


	
	}

}
