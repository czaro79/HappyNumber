import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution = new Solution();

    @org.junit.Test
    public void isHappy() {
        assertEquals(true, solution.isHappy(19));
        assertEquals(false, solution.isHappy(4));
        assertEquals(true, solution.isHappy(1));
        assertEquals(true, solution.isHappy(10000));

    }
}