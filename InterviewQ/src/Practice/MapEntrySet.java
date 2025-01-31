package Practice;

import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapEntrySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Dimension>map=new HashMap<>() ;
		map.put("pixel", new Dimension(412,912));
		map.put("Samsung", new Dimension(1500,1250));
		map.put("appleTab", new Dimension(1024,1366));
		map.put("Desktop", new Dimension(2188,1373));
		
		//for(String str:words){}
		for(Map.Entry<String,Dimension> device:map.entrySet()) {
			System.out.println(device.getKey()+" "+device.getValue());
			//driver.manage().window().setSize(device.getValue());
		}
		
	}

}
