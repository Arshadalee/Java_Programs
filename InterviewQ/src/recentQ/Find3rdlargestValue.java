package recentQ;

public class Find3rdlargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1,2,5,6,7,8,9,4,13,45,48,9,44,35};
		if(arr.length<3) {
			System.out.println("Length must be greater than 3");
		}
		
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		
		for(int num :arr) {
			if(num>first) {
				third=second;
				second=first;
				first=num;
			}else if(num<first && num>second) {
				third=second;
				second=num;
			}else if(num <second && num>third) {
				third=num;
			}
	
		}
		System.out.println(first+" "+second+" "+third);
		
	}

}
