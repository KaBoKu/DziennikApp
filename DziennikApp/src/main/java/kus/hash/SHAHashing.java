package kus.hash;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHAHashing {
	public static String hashing(String password){
		String result = null;
		if (password == null) return null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			byte[] hash = md.digest(password.getBytes("UTF-8"));
			 StringBuilder sb = new StringBuilder(2*hash.length);
	           for(byte b : hash){
	               sb.append(String.format("%02x", b&0xff));
	           }          
	           result = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
