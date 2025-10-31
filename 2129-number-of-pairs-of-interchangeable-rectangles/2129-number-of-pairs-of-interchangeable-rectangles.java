import java.util.*;

class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Arrays.sort(rectangles, (a, b) -> {
            double r1 = (double) a[0] / a[1];
            double r2 = (double) b[0] / b[1];
            return Double.compare(r1, r2);
        });
        long c = 0;
        int n = rectangles.length;
        for (int i = 0; i < n; i++) {
            int l = i, r = n - 1;
            double first = (double) rectangles[i][0] / rectangles[i][1];
            int is = -1;
            while (l <= r) {
                int mid = (l + r) / 2;
                double second = (double) rectangles[mid][0] / rectangles[mid][1];
                if (first == second) {
                    is = mid;
                    l = mid + 1;
                } else if (second > first) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            if (is != -1)
                c += (is - i);
        }
        return c;
    }
}