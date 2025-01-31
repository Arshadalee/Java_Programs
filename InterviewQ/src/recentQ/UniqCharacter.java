package recentQ;

import java.util.HashSet;

public class UniqCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="fjasndfkjujnrkj fg gjr gj2@nf&*%*%($%^(&^%(&^";
		String str2="sdinfujnyrb98y578345y603745#8789454%$&*(_#&%*(@#*&%^_495";
		
		HashSet<Character>set1=new HashSet<>();
		
		HashSet<Character>set2=new HashSet<>();
		
		for(char c:str1.toCharArray()) {
			set1.add(c);
			
		};
		for(char c:str2.toCharArray()) {
			set2.add(c);
		}
		HashSet<Character>uniqueChars=new HashSet<>(set1);
		uniqueChars.addAll(set2);//set1+set2
		HashSet<Character>comonChars=new HashSet<>(set1);
		comonChars.retainAll(set2);//set1-set2 store only common elements
		uniqueChars.removeAll(comonChars);//removes the comon elements from set and get only uniq elements
		
		StringBuilder result=new StringBuilder();
		for(char c:uniqueChars) {
			result.append(c);
		};
		System.out.println(result.toString());
		
	}

}
