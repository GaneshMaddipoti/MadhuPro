package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class SampleOne {

	static Map m = new HashMap();
	
	public static void main(String[] args) {
		SampleOne sample = new SampleOne();
		String[] s = { "a", "b", "c", "d" };
		String[] values = { "1", "2", "3", "4" };
		List<String> list = new ArrayList();
		/**
		 * Adding elements into the map
		 */
		
		for (String add : values) {
			list.add(add);
		}
		System.out.println(list);
		for (int i = 0; i < s.length; i++) {
			m.put(s[i], list);
		}
		System.out.println(m);

		/**
		 * Displaying elements from the map
		 */
		sample.dispElements("a");	
	}
	public void dispElements(String key){
		System.out.println(m.get(key));
	}

}
