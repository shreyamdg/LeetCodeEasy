package arraysAndstrings;

public class CheckPalindrome {
	public boolean isPalindrome(int num) {
		int revNum = 0;
		
		while(num != 0) {
			int rem = num %10;
			revNum = revNum*10 + rem;
			num = num / 10;
		}
		
		if(num == revNum)
			return true;
		else 
			return false;
	}
}
