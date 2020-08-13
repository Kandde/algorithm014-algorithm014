package action.climbstairs;

/**
 * 1. 0813
 * @author zhaohongxin
 */
public class ClimbStairs {

    public int solution1(int n) {
        if (n <= 2) {
            return n;
        }
        int f1 = 1, f2 = 2, f3 = 0;
        for (int i = 3; i <= n; i ++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public int solution2(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return solution2(1) + solution2(2);
    }

    public int climbStairs(int n) {
        int cur = 1, next = 1;
        while (n -- > 0) {
            cur = (next += cur) - cur;
        }
        return cur;
    }
}
