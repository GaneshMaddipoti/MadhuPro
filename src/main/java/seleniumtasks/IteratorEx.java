package seleniumtasks;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorEx {
	
	public static void main(String[] args){
		int[] inp = {1, 3, 2, 4, 1, 3};
		List<Integer> list = new ArrayList<Integer>();
		for(int temp : inp){
		if(!list.contains(temp)){
			list.add(temp);
		}
	
		}
		System.out.println(list);
	}}
