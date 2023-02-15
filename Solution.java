public class Solution {
    public static long sumCubes(long n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i * i * i;
        }
        return sum;
    }
}