package question2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String args[]){
		LinkedHashMap<String,String> hm=new LinkedHashMap<>();
		
		hm.put("Uttar Pradesh","Lucknow");
		hm.put("Madhya Pradesh","Bhopal");
		hm.put("karnataka","Banglore");
		hm.put("Bihar","Patna");
		hm.put("Goa","Panji");
		
		for(Map.Entry<String,String> me:hm.entrySet()){
		System.out.println("Capital of "+me.getKey()+" is "+me.getValue());
		}
		}

}
