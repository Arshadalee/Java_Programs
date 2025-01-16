package recentQ;

public class ShiftZeroToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String binary="1110111111";
		char [] ch=binary.toCharArray();
		
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]=='0' && ch[i+1]!='0') {
				
				ch[i]=ch[i+1];
				ch[i+1]='0';
				break;
			}
		}
		String result=new String(ch);
		System.out.println(result);
	}

}
