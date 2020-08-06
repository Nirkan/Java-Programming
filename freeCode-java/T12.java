
import java.util.Map;

import java.util.HashMap;

import java.util.LinkedHashMap;

import java.util.TreeMap;

class Main{

	public static void main(String[] args){

		Map m = new HashMap();      // Does not keep track of order of elements.

		m.put("bill", 5);

		m.put("joe", "x");

		m.put(11,999);

		m.containsValue("x");

		m.containsKey(5);


		Map k = new TreeMap();      // Datatype shoud be same here.

		k.put("Hillary", 8);

		k.put("Bernie", 7);

		k.put("Trump", 9);


		Map p = new LinkedHashMap();  // order in which we added.

		p.put("bill", 5);

		p.put("joe", "x");

		p.put(11,999);


 
		
		System.out.println(m);

		System.out.println(m.get("bill"));

		System.out.println(k);

		System.out.println(p);

		System.out.println(m.containsKey(5));

		System.out.println(m.containsValue("x"));




		

	}


}
