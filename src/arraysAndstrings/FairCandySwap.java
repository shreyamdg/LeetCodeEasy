package arraysAndstrings;

public class FairCandySwap {
	public int[] fairCandySwap(int[] A, int[] B) {
        int sumA =0, sumB =0;
        
        for (int x: A) 
            sumA += x;
        for (int x: B) 
            sumB += x;
        
        int totalSumHalf = (sumA+sumB)/2;
        
        for(int i = 0; i< A.length; i++){
            int offset = sumA - A[i];
            int num = totalSumHalf - offset;
            for(int j = 0; j<B.length; j++){
                if(B[j] == num){
                    return new int[]{A[i],num};
                }
            }
        }
        return A;
    }
}
