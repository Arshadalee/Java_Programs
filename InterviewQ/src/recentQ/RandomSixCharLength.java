package recentQ;

import java.util.UUID;

public class RandomSixCharLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sixchar=UUID.randomUUID().toString();
sixchar=sixchar.replace("-", "").replaceAll("\\d+", "");
sixchar=sixchar.substring(0,6);
System.out.println(sixchar);
	}

}
