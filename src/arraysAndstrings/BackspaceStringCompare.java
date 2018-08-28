package arraysAndstrings;

public class BackspaceStringCompare {
	public boolean backspaceCompare(String S, String T) {
        return editedString(S).equals(editedString(T));
    }
	
	public String editedString(String str){
        StringBuilder sb = new StringBuilder();
        int count=0;
        for(int i = str.length()-1; i>=0; i--){
            if(str.charAt(i) == '#'){
                count++;
            }else{
                if(count > 0){
                    count--;
                }else{
                    sb.append(str.charAt(i));
                }
            }
        }
        
        return sb.toString();
    }
}

