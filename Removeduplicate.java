package week3.day2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Removeduplicate {
public static void main(String[] args) {
		String text = "We learn java basics as part of  basics sessions in java week1";
		text = text.toLowerCase();    
		String words[] = text.split(" ");
		System.out.println("Input text:\t"+Arrays.toString(words));
		Set<String> org = new HashSet<>();
		System.out.println("Duplicate words in a given string : ");     
		for (int i = 0; i < words.length - 1; i++) {
			for (int j = 1; j < words.length; j++) {
				if (words[i].equals(words[j]) && i != j) {
					org.add(words[i]);
				}
			} 
		}
		System.out.println(org);
	}	            
	
	}
