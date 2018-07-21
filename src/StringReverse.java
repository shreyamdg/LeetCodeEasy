
public class StringReverse {
	public static String reverseString(String s) {
        char [] arr = s.toCharArray();
        int last = s.length() -1;
        int first = 0;
        
        while(first<last){
            char c = arr[first];
            arr[first] = arr[last];
            arr[last] = c;
            last--;
            first++;
        }
        
        return new String(arr);
    }
	
	public static void main(String[] args) {
		System.out.println(reverseString("Shreyam"));

	}

}
