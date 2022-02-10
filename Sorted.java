package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[]input= {"hcl","wipro","aspire system","cts"};
List<String> list = new ArrayList<String>();
list.add("hcl");
list.add("wipro");
list.add("aspire system");
list.add("cts");
Collections.sort(list);
for (int i=0;i<list.size();i++) {
    System.out.println(list.get(i));
}
Collections.reverse(list);
System.out.println(list);
	}
	

}
