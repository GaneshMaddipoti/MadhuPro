package Practice;

import java.util.ArrayList;
import java.util.Iterator;



public class Arraylist
{
		public static void main(String[] args) 
		{
			ArrayList<String> list=new ArrayList<String>();
			list.add("divya");
			list.add("dileep");
			list.add("swamy");
			
			ArrayList<String> list1=new ArrayList<String>();
			list1.add("swamy");
			list1.add("divyaswamy");
			list1.add("dileephm");
			//System.out.println(list.addAll(list1));
			//list.addAll(0,list1);
			//System.out.println(list.removeAll(list1));
			//list.removeAll(list1);
			//list.retainAll(list1);
			list.set(0, "tyu");
			Iterator itr=list.iterator();
			//System.out.println(itr=list.iterator());
			while (itr.hasNext()) 
			{
				System.out.println(itr.next());
			
				
			}
			
		}

}
