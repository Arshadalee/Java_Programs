package recentQ;

public class AABBBCCCtoA2B3C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="AABBBCCCD";
		StringBuilder word=new StringBuilder();
		
		int count=1;
		for(int i=1;i<str.length();i++) {		
			if(str.charAt(i)==str.charAt(i-1)) {
				
				count++;
			}else {
				word.append(str.charAt(i-1)).append(count);
				count=1;
			
			}
		}
		word.append(str.charAt(str.length()-1)).append(count);
		System.out.println(word.toString());
	}

}
