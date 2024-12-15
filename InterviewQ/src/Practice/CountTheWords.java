package Practice;

import java.util.HashMap;
import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//reads a sentence input by the user and calculates the frequency of each word in the sentence. 
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		
		String line=sc.nextLine();
		
		//step2
		String [] str=line.toLowerCase().split(" ");
		
		//step3
		HashMap<String,Integer>map=new HashMap<>();
		
		for(int i=0;i<str.length;i++) {
			if(map.containsKey(str[i])) {
				int count=map.get(str[i]);
				count++;
				map.replace(str[i], count++);
			}else {
				map.put(str[i], 1);
			}
		}
		
		System.out.println(map);
		
	
	}

}
