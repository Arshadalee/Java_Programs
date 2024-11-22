package recentQ;

public class ChekUpperLoweCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aaaBBccDDssKK";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
		if(Character.isUpperCase(ch[i])) {
			Character.toLowerCase(ch[i]);
		}else {
			Character.toUpperCase(ch[i]);
		}
		}

	}

}
