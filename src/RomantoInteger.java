
public class RomantoInteger {
	
	/*
	  Symbol       Value
		I             1
		V             5
		X             10
		L             50
		C             100
		D             500
		M             1000
	 */
	
	public static int romanToInt(String s) {
        int num = 0;
        char [] charArr = s.toUpperCase().toCharArray();
        for(int i=0; i<charArr.length; i++) {
        	
        	if(charArr[i] == 'I' && (i+1) < charArr.length && charArr[i+1] == 'V') {
        		num = num + 4;
        		i++;
        	}else if(charArr[i] == 'I' && (i+1) < charArr.length && charArr[i+1] == 'X') {
        		num = num + 9;
        		i++;
        	}else if(charArr[i] == 'I') {
        		num = num + 1;
        	}else if(charArr[i] == 'V') {
        		num = num + 5;
        	}else if(charArr[i] == 'X' && (i+1) < charArr.length && charArr[i+1] == 'L') {
        		num = num + 40;
        		i++;
        	}else if(charArr[i] == 'X' && (i+1) < charArr.length && charArr[i+1] == 'C') {
        		num = num + 90;
        		i++;
        	}else if(charArr[i] == 'X') {
        		num = num + 10;
        	}else if(charArr[i] == 'L') {
        		num = num + 50;
        	}else if(charArr[i] == 'C' && (i+1) < charArr.length && charArr[i+1] == 'D') {
        		num = num + 400;
        		i++;
        	}else if(charArr[i] == 'C' && (i+1) < charArr.length && charArr[i+1] == 'M') {
        		num = num + 900;
        		i++;
        	}else if(charArr[i] == 'C') {
        		num = num + 100;
        	}else if(charArr[i] == 'D') {
        		num = num + 500;
        	}else if(charArr[i] == 'M') {
        		num = num + 1000;
        	}
        }
       
        return num;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}

}
