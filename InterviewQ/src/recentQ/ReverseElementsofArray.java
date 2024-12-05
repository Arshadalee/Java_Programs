package recentQ;

public class ReverseElementsofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String[] arr = {"abc", "xyz", "lmn"};
		  
		
		 
		 String []reverse=new String[arr.length];
		 
		 for(int i=0;i<arr.length;i++) {
			 StringBuilder rvs=new StringBuilder();
			 reverse[i]=rvs.append(arr[arr.length-1-i]).reverse().toString();
			 
		 }
		 for(String str:reverse) {
			 
			  System.out.print(str+" ");
		 }

	}

}
