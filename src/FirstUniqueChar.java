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
	public static void main(String[] args) {
		System.out.println(firstUniqChar("leetcode"));
	}

}
