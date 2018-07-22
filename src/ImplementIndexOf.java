
public class ImplementIndexOf {
	public static int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        
        int needleLength = needle.length();
        
        for(int i = 0; i < haystack.length(); i++){
            String str = "";
            if(i+needleLength <= haystack.length())
                str = haystack.substring(i,i+needleLength);
            if(str.equals(needle)){
                return i;
            }
        }
        
        return -1;
    }

	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "ll";
		System.out.println(strStr(haystack, needle));
	}

}
