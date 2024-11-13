package recentQ;

import java.util.HashMap;
import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("enter the senentence");

String line=sc.nextLine();

String str[]=line.toLowerCase().split(" ");

HashMap <String,Integer>map=new HashMap<>();

for(int i=0;i<str.length;i++) {
	
	if(map.containsKey(str[i])) {
		int count=map.get(str[i]);
		count++;
		map.replace(str[i],count);
		
	}else {
		map.put(str[i],1);
	}
}
System.out.println(map);

	}

}
