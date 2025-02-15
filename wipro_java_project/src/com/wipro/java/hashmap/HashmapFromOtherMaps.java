package com.wipro.java.hashmap;
import java.util.*;

public class HashmapFromOtherMaps
{
	public static void main(String[] args) {
		 // create a treemap
	    TreeMap<String, String> mailids = new TreeMap<>();
	    mailids.put("navya@gmail.com", "navya123");
	    mailids.put("sindhu@gmail.com", "sind481");
	    mailids.put("swathi@gmail.com: ", "swa456");
	    System.out.println("Mail Id-> username and passwords : " + mailids);

	    // create hashmap from the treemap
	    HashMap<String, String> mail = new HashMap<>(mailids);
	    mail.put("dhana@gmail.com", "dhana345");
	    System.out.println("HashMap: " + mail);
	}
}
