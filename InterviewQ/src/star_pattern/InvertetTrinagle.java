package star_pattern;

public class InvertetTrinagle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		for(int i=0;i<5;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

}
