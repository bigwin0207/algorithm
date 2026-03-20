class Solution {
    public int solution(int n, int m, int[] section) {
        int result = 0;
        int paintedUntil = 0; 

        for (int s : section) {
            if (s > paintedUntil) {
                result++;
                paintedUntil = s + m - 1; 
            }
        }
        
        return result;
    }
}