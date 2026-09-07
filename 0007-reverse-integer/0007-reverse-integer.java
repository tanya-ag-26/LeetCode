class Solution {
    public int reverse(int x) {
        long m = 0;

        while (x != 0) {
            m = m * 10 + x % 10;
            x = x / 10;
        }

        if (m > Integer.MAX_VALUE || m < Integer.MIN_VALUE) {
            return 0;
        }

        return (int)m;
    }
}