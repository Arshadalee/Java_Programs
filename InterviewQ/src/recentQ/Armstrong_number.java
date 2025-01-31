package recentQ;

import java.util.Scanner;

public class Armstrong_number {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);

		int Onumber=sc.nextInt();

		int result=0;


		int number=Onumber;
		int p=String.valueOf(Onumber).length();
System.out.println("value of p "+p);
		while(Onumber!=0) {
			int reminder=Onumber%10;
			result+=Math.pow(reminder,p);
			Onumber=Onumber/10;
			
			
		}
		if(number== result) {
			System.out.println(number+" this is armstrong number");
		}else {
			System.out.println("this is not armstrong number");
		}
		}
	}


