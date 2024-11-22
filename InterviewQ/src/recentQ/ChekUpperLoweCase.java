package recentQ;

public class ChekUpperLoweCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aaaBBccDDssKK";
		char[] ch=str.toCharArray();
		
		char[]cv=new char[ch.length];
		
		for(int i=0;i<ch.length;i++) {
			
		if(Character.isUpperCase(ch[i])) {
			cv[i]=Character.toLowerCase(ch[i]);
		}else {
			cv[i]=Character.toUpperCase(ch[i]);
		}
		}
		
		String convert= new String(cv);
		
		System.out.println(convert);
		
		
		
		

	}

}
