package Practice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {
	static int count, highest;

	public static void main(String[] args) {

		int[] a = { 1, 1, 2, 2, 2, 2, 3, 1 };

		Set<Integer> s = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}

		Iterator itr = s.iterator();
		for (int i = 0; i < s.size(); i++) {

			Integer value = (Integer) itr.next();

			int val = value.intValue();

			count = 0;

			for (int j = 0; j < a.length; j++) {

				if (val == a[j]) {

					count++;
				}

			}
			System.out.println("repeted value: " + value + " count:" + count);

		}

	}
}
