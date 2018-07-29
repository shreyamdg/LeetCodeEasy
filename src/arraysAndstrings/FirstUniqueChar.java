package arraysAndstrings;
import java.util.HashMap;

public class FirstUniqueChar {
	public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else
                map.put(ch,map.get(ch) + 1);
            }
            
            char []arr = s.toCharArray();
            for(int i =0; i<s.length(); i++){
                if(map.get(arr[i]) == 1)
                    return i;
            }
            
            return -1;
        
    }
	
	// Without extra space. 
	
	public static int firstUniqAnotherWayChar(String s) {
		int [] chars = new int[128];
		for(int i = 0; i<s.length(); i++) {
		    int val = s.charAt(i);
            chars[val]=chars[val] + 1;
		}
        
        char [] arr = s.toCharArray();
        
        for(int j = 0; j<s.length(); j++){
            int val = arr[j];
            if(chars[val] == 1){
                return j;
            }
        }
		return -1;
		}
	public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));
	}

}
