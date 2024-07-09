import java.util.*;

public class newchange {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
            s.truncateNumber(3.5) == 0.5,
            Math.abs(s.truncateNumber(1.33) - 0.33) < 1e-6,
            Math.abs(s.truncateNumber(123.456) - 0.456) < 1e-6
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

class Solution {
    public double truncateNumber(double num) {
        return num - Math.floor(num);
    }
}