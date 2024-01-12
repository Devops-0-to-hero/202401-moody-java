package in.conceptarchitect.utils;

public class Encrypt {
	
	public static String hash(String text) {
		String encryptedText="";
		
		for(int i=0; i<text.length();i++) {
			
			int value = text.charAt(i);
			
			encryptedText+=Integer.toHexString(value);
		}
		
		return encryptedText;
	}

}
