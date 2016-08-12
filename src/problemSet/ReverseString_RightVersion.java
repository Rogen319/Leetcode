package problemSet;

public class ReverseString_RightVersion {
	public String reverseString(String s) {
		char temp;
		char[] sArray = s.toCharArray();
		for(int i = 0, j =  s.length() - 1; i < j; i++, j--){
			temp = sArray[i];
			sArray[i] = sArray[j];
			sArray[j] = temp;
		}
		return new String(sArray);
	}

}
