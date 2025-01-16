package star_pattern;

public class CenterdTrinagle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		
		for(int i=0;i<n;i++) {
			
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
			System.out.print("*");
			}
			for(int m=1;m<i;m++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
