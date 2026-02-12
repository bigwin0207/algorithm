class Solution {
    public double solution(int[] arr) {
        double answer = arr.length;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        double s;
        s = (double)sum / answer;
        
        
        return s;
    }
}