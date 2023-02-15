public class Solution1 {
    public static int century(int number) {
        if ((number % 100) == 0) {
            return number / 100;
        }
        return 1 + number / 100;
    }
}