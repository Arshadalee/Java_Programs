package recentQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
		boolean isPrime = true;
		for(int i=2;i<=num/2;i++) {
			
			if(num%2==0) {
				isPrime=false;
				
			}else {
				isPrime=true;
			}
		}
		
		if(isPrime==true) {
			System.out.println("this is prime number");
		}else {
			System.out.println("this is not prime number");
		}
		
		List <Integer>list=new ArrayList<>();
		list.add(null);
		list.get(num);
		list.set(num, null);
		list.remove(num);
		list.size();
		list.contains(num);
		list.clear();
		list.toArray();
		
		String[] arr=new String[30];
		Arrays.sort(arr);
		Arrays.toString(arr);
		Arrays.equals(arr, null);
		Arrays.mismatch(arr, null);
		
		
		Collections.binarySearch(list, 3);
		Collections.swap(list,0,2);
		
		HashMap<String,Integer>map=new HashMap<>();
		String str="ajdfjsdfyewbrj";
		map.put(null, null);
		map.get(map);
		map.containsKey("aa");
		map.size();
		map.isEmpty();
		map.putIfAbsent(null, null);
		map.replace("aaa",1);
		str.charAt(num)
;
		str.substring(0,1);
		str.lastIndexOf(str);
		
		
		Character.isDigit(str.charAt(0));
		
		
	}

}


