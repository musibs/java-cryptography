package io.tbc.java.crypto.basics;

import java.security.Provider;
import java.security.Security;

/**
 * This class provides the list of security providers configured in
 * java.security file
 * 
 * @author musib
 *
 */
public class SecurityProviders {

	public static void main(String[] args) {
		Provider[] providers = Security.getProviders();
		for (Provider provider : providers) {
			System.out.println(provider);
		}
	}

}
