package io.tbc.java.crypto.basics;

import java.security.Provider;
import java.security.Security;
import java.util.Set;

public class ProviderCapabilities {

	public static void main(String[] args) {
		
		//Provider provider = Security.getProvider("SunJCE");
		Provider provider = Security.getProvider("BC");
		Set<Object> keyset = provider.keySet();
		for(Object key : keyset) {
			String entry = (String) key;
			if(entry.startsWith("Alg.Alias.")) {
				entry = entry.substring("Alg.Alias.".length());
			}
			//System.out.println("Entry : "+entry);
			String factoryClass = entry.substring(0, entry.indexOf('.'));
			String name = entry.substring(factoryClass.length()+1);
			System.out.println("Factoty Class : "+name);
		}
		
	}
}
