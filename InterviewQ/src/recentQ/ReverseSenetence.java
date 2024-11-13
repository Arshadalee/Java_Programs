package recentQ;
import java.util.*;
public class ReverseSenetence {
	public static void main(String[] args) {
		String name="arshadali mullla";
		
		String []words=name.split(" ");
		StringBuilder reverseWords= new StringBuilder();
		
		for(String word:words) {
			String rword=new StringBuilder(word).reverse().toString();
		reverseWords.append(rword).append(" ");
		}
		String rs=reverseWords.toString().trim();
		System.out.println(rs);
	}
	}


