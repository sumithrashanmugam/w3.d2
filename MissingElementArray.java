package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementArray {

	public static void main(String[] args) {
		
				int[] array = {1,2,3,4,5,6,8};
				List<Integer>list = new ArrayList<Integer>();
				list.add(1);
				list.add(2);
				list.add(3);
				list.add(4);
				list.add(5);
				list.add(6);
				list.add(8);
				Collections.sort(list);
				System.out.println(list);
				
				int sum1 =1;
				for(int i = 0; i<array.length;i++)
				{
					if(sum1!=array[i]) {
						System.out.println(sum1);
						break;
					}
					sum1++;
				}
				
}
}
