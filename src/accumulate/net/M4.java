package accumulate.net;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.printf("(%d, %d)\n", this.x, this.y);
    }
}

class sortX implements Comparator<Point> {
    public int compare(Point p1, Point p2) {
        if (p1.x < p2.x) {
            return -1;
        }
        if (p1.x > p2.x) {
            return 1;
        }
        return p1.y - p2.y;
    }
}

class sortY implements Comparator<Point> {
    public int compare(Point p1, Point p2) {
        if (p1.y < p2.y) {
            return -1;
        }
        if (p1.y > p2.y) {
            return 1;
        }
        return p1.x - p2.x;
    }
}

public class M4 {

    static long get(int x, int[] c) {
        long res = 0;
        while (x > 0) {
            res += c[x];
            x -= x & -x;
        }
        return res;
    }

    static void add(int x, int[] c) {
        while (x < c.length) {
            c[x]++;
            x += x & -x;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ttt = in.nextInt();
        while (ttt-- > 0) {
            int n = in.nextInt();
            Point[] p = new Point[n];
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                p[i] = new Point(x, y);
            }
            Arrays.sort(p, new sortY());
            int ny = 0, pre = -1;
            for (int i = 0; i < n; i++) {
                if (p[i].y > pre) {
                    ny++;
                }
                pre = p[i].y;
                p[i].y = ny;
            }
            int[] c = new int[n + 1];
            int[] e = new int[n + 1];
            for (int i = 0; i < c.length; i++) {
                c[i] = 0;
                e[i] = 0;
            }
            long ans = 0;
            Arrays.sort(p, new sortX());
            for (int l = n - 1, r = l; l >= 0; l = r) {
                while (r >= 0 && p[r].x == p[l].x) r--;
//       p[l].print();
                ans += get(p[l].y - 1, c) + 1;
                for (int i = l - 1; i > r; i--) {
//           p[i].print();
                    if (p[i].y == p[i + 1].y) continue;
                    if (e[p[i].y] == 0) ans += 1;
//           System.out.println(ans);
                }
                for (int i = l; i > r; i--) {
                    if (e[p[i].y] == 0) {
                        add(p[i].y, c);
                        e[p[i].y] = 1;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
