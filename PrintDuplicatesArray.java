package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;


public class PrintDuplicatesArray {

	public static void main(String[] args) {
		
	    int[] count = {1,2,3,4,3};
	    List<Integer> list = new ArrayList<>(count.length);
		 
        for (int i: count) {
            list.add(Integer.valueOf(i));
        }
	     System.out.println(list);
	     list.size();
	  LinkedHashSet<Integer> orginal = new LinkedHashSet<>();
      LinkedHashSet<Integer> duplicate = new LinkedHashSet<>();
		     for (Integer integer : list) {
		        if(!orginal.add(integer)) {
		           duplicate.add(integer);
		        }
		     }
		     System.out.println("Duplicate no is " + duplicate);

		}
}

	
	     
	
      
   
		