package recentQ;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7}; 
		int k=3;
		int len=7;
		for(int i=0;i<=k;i++) {
			for(int j=0;j<=len;j++) {
				arr[0]=arr[len-1];
				if(j<len-1) {
					arr[j+1]=arr[j];
				}
				
			}
		}
		for(int num:arr) {
			System.out.println(num);
		}
		

	}

}
