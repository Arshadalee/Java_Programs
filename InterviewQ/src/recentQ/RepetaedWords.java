package recentQ;

public class RepetaedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="A2B3C1";
		
		StringBuilder words=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i))) {
				char ch=str.charAt(i);
				
				int value=Character.getNumericValue(str.charAt(i+1));
				
				for(int j=0;j<value;j++) {
					words.append(ch);
				}
			}
		}
		
		System.out.println(words.toString());

	}

}
