import java.util.ArrayList;

public class Solution {

    public boolean isHappy(int n) {


        ArrayList<Integer> sums = new ArrayList<>();

        while (n != 1) {
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (sums.contains(sum)) return false;
            sums.add(sum);
            n = sum;
        }
        return true;

    }

}
