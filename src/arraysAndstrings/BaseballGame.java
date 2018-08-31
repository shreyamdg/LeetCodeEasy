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

	public int calPointsAnotherSol(String[] ops) {
		int[] score = new int[ops.length];
		int index = 1;
		score[0] = Integer.parseInt(ops[0]);
		for (int i = 1; i < ops.length; i++) {
			if (ops[i].equals("+")) {
				score[index] = score[index - 1] + score[index - 2];
				index++;
			} else if (ops[i].equals("C")) {
				index--;
				score[index] = 0;
			} else if (ops[i].equals("D")) {
				score[index] = 2 * score[index - 1];
				index++;
			} else {
				score[index] = Integer.parseInt(ops[i]);
				index++;
			}
		}
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		return sum;
	}
}
