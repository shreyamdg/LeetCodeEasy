
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
	
	// 3 ms solution.
	public static String anotherSolution(String s) {
		char [] arr = s.toCharArray();
		int i = 0, j = s.length()-1;
		
		while(i<j) {
			if(checkVowel(arr[i])) {
				if(checkVowel(arr[j])) {
					char c = arr[j];
					arr[j] = arr[i];
					arr[i] = c;
					i++; j--;
					continue;
				}else {
					j--; 
					continue;
				}
			}
			
			i++;
		}
		
		return new String(arr);
	}
	
    public static boolean checkVowel(char ch) {
    	if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || 
                		ch == 'U') {
    		return true;
    	}
    	
    	return false;
    }
    
	
	public static void main(String[] args) {
		System.out.println(anotherSolution("leetcode"));

	}

}
