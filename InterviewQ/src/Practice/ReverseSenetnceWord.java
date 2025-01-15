package Practice;

public class ReverseSenetnceWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Hello world, hello dev";
		
		String arr[]=s1.split(" ");
		
		
		String rvs[]=new String[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			String word=arr[i];
			char ch[]=new char[word.length()];
			for(int j=0;j<word.length();j++) {
				ch[j]=word.charAt(word.length()-1-j);
			}
			rvs[i]=new String(ch);
		}
		
		String reverseSentence=String.join(" ", rvs);
		
		System.out.println(reverseSentence);
		
		
	}

}
