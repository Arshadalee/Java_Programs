package recentQ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="asdghjklmnbvcxzasgj";
		
		char ch[]=str.toCharArray();
		
		HashSet<Character>set=new HashSet<>();
		List<Character>list=new ArrayList<>();
		
		for(int i=0;i<ch.length;i++) {
			if(!set.contains(ch[i])) {
				set.add(ch[i]);
			}else {
				list.add(ch[i]);
				
			}
			
			
		}System.out.println("duplicate characters"+list);

	}

}
