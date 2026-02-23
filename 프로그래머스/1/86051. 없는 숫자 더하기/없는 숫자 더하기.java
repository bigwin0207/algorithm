import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        int total = 45;
        for(int n : numbers) {
            sum += n;
        }
        return total - sum;
    }
}