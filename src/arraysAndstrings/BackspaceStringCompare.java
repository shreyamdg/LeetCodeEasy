package arraysAndstrings;

import java.util.Stack;

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
	
	public boolean backspaceCompareAnotherSolution(String S, String T) {
        Stack<Character> ch1 = new Stack<>();
        Stack<Character> ch2 = new Stack<>();
        
        for(char ch : S.toCharArray()){
            if(ch == '#'){
                if(ch1.isEmpty()){
                    continue;
                }else
                    ch1.pop();
            }else{
                ch1.push(ch);
            }
        }
        
        for(char ch : T.toCharArray()){
            if(ch == '#'){
                if(ch2.isEmpty()){
                    continue;
                }else
                    ch2.pop();
            }else{
                System.out.println("char: " + ch);
                ch2.push(ch);
            }
        }
        
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        
        while(!ch1.isEmpty()){
            s1.append(String.valueOf(ch1.pop()));
        }
        
        while(!ch2.isEmpty()){
            s2.append(String.valueOf(ch2.pop()));
        }
        
        System.out.println(s1 + ":" + s2);
        
        return s1.toString().equals(s2.toString());
    }
}

