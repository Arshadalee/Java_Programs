package recentQ;

public class ExtractOnlyNumberes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="arsh123567";
		StringBuilder nums=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				nums.append(str.charAt(i));
			}
		}
		
		String result=nums.toString();
		System.out.println(result);
	}

}
