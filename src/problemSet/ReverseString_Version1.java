package problemSet;

public class ReverseString_Version1 {
	
	public String reverseString(String s) {
		String result = "";
		for(int i = s.length() - 1; i >= 0 ; i--){
			result += s.charAt(i);
		}
		return result;
	}
}
