package com.eCommerce.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class USConstants {
	
	public final static String US = "US";
	
	public final static Map<String, String> mapOfUSStates = new HashMap<String, String>() {
		{
			put("Barisal", "Barisal");
			put("Dhaka", "Dhaka");
			put("Chittagong", "Chittagong");
            put("Khulna", "Khulna");
            put("Mymensingh", "Mymensingh");
            put("Rajshahi", "Rajshahi");
            put("Sylhet", "Sylhet");
            put("Rangpur", "Rangpur");
           
		}
	};
	
	public final static List<String> listOfUSStatesCode = new ArrayList<>(mapOfUSStates.keySet());
	public final static List<String> listOfUSStatesName = new ArrayList<>(mapOfUSStates.values());

}
