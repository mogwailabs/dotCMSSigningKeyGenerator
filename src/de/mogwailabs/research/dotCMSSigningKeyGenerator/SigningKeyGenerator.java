package de.mogwailabs.research.dotCMSSigningKeyGenerator;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;

public class SigningKeyGenerator {

	public static void main(String[] args) {
		System.out.println("----- dotCMS TokenGenerator PoC by MOGWAI LABS GmbH (https://mogwailabs.de) -----");
		System.out.println();
		Key key = null;
		String stringKey;
		try {
			KeyGenerator gen = KeyGenerator.getInstance("AES");
			gen.init(256);
			key = gen.generateKey();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		stringKey = Base64.objectToString(key);
		System.out.println("Your config file will be somewhere arround: {dotCMSRoot}/dotserver/tomcat{versions}/webapps/ROOT/WEB-INF/classes/dotmarketing-config.properties");
		System.out.println("Key:");
		System.out.println(stringKey); // Key is shorter but more secure then the default one (Default key was generated with DES)
	}
}
