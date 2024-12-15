package star_pattern;

import java.util.Scanner;

public class Tringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows for patterns");
		int rows=scanner.nextInt();
		
		System.out.println("Right-angles triangle");
		
		for(int i=0;i<=rows;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\\n2. Inverted Right-Angled Triangle:");
		for(int i=rows;i>=1;i--) {
			for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
		}

	}

}
