package arraysAndstrings;

import java.util.Stack;

public class BaseballGame {
	public int calPoints(String[] ops) {
        Stack<Integer> score = new Stack<>();
        int sum = 0;
        
        for(String ch : ops){
            if(ch.equals("C")){
                int num = score.pop();
                sum = sum - num;
            }else if(ch.equals("D")){
                int num = score.peek()*2;
                score.push(num);
                sum = sum + num;
            }else if(ch.equals("+")){ 
                int num1 = score.pop();
                int num2 = score.pop();
                score.push(num2);
                score.push(num1);
                score.push(num1+num2);
                sum = sum + num1 + num2;
            }else{
                score.push(Integer.valueOf(ch));
                sum = sum + Integer.valueOf(ch);
            }
        }
        return sum;
    }
}
