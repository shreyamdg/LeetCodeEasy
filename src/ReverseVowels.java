
public class ReverseVowels {
	
	public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        StringBuilder stringVowel = new StringBuilder();
        for(int i = 0; i < sb.length(); i++) {
        	if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i'|| sb.charAt(i) == 'o'|| sb.charAt(i) == 'u'
                 || sb.charAt(i) == 'A' || sb.charAt(i) == 'E' || sb.charAt(i) == 'I' || sb.charAt(i) == 'O' || 
                    sb.charAt(i) == 'U') {
        		stringVowel.append(sb.charAt(i));
        	}
        }
        stringVowel.reverse();
        int count = 0;
        for(int i = 0; i<sb.length(); i++) {
        	if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i'|| sb.charAt(i) == 'o'|| sb.charAt(i) == 'u'
                 || sb.charAt(i) == 'A' || sb.charAt(i) == 'E' || sb.charAt(i) == 'I' || sb.charAt(i) == 'O' || 
                    sb.charAt(i) == 'U') {
        		sb.setCharAt(i, stringVowel.charAt(count));
        		count++;
        	}
        }
        
        return sb.toString();
    }

	public static void main(String[] args) {
		System.out.println(reverseVowels("leetcode"));

	}

}