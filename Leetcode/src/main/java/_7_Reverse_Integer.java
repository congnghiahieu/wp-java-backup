public class _7_Reverse_Integer {
    public static int reverse(int x) {
        if (x == 0) return 0;
        boolean isNegative = x < 0;
        x = Math.abs(x);
        if (x % 10 == 0) x /= 10;
        long revX = 0;
        while (x > 0) {
            int i = x % 10;
            revX = revX * 10 + i;
            x /= 10;
        }
        if (isNegative) revX *= -1;
        if (revX < Integer.MIN_VALUE || revX > Integer.MAX_VALUE) return 0;
        return (int) revX;
    }
}
