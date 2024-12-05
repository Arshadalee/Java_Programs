package recentQ;

public class ReverseSentenceWithoutStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hello world arshad";
		String []arr=str.split(" ");
		//emtpy string
		
		
		String rvs[]=new String[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			String s1=arr[i];
			char ch[]=new char[s1.length()];
			for(int j=0;j<s1.length();j++) {
				ch[j]=s1.charAt(s1.length()-1-j);
			}
			rvs[i]=new String(ch);
		}
		
		String revserStringresult=String.join(" " , rvs);
		System.out.println(revserStringresult);
	}

}
