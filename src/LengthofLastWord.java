
public class LengthofLastWord {
	public static int lengthOfLastWord(String s) {
        String []strArr = s.split("\\s");
        if(strArr.length == 0)
            return 0;
        else
         return strArr[strArr.length-1].length();
    }
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("     "));

	}

}
