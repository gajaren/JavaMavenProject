package map;

import java.util.HashMap;
import java.util.Map;

public class PrintMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Object,Object> map=new HashMap<Object,Object>();
		map.put("Nilesh", 1);
		map.put("Gajare", 'C');
		map.put(3, "Sonali");
		map.put("Nilesh", 9);
		
		for (Map.Entry m:map.entrySet()) {
			System.out.println("Key is:" + m.getKey() +" "+ "Values is:" + m.getValue());
		}
		
		
	}

}
