package org.example;


public class Calculation {
    public static String position(MathModel lp) {
        String answ;

        answ = lp.position();

        if (answ == "belongs") {
            System.out.println("""
                al + bm + cn = 0
                al + bm + cn + d = 0
                """);
        }
        else if (answ == "parallel") {
            System.out.println("""
                al + bm + cn = 0
                al + bm + cn + d =/= 0
                """);
        }
        else if (answ == "perpendicular") {
            System.out.println("""
                al + bm + cn =/= 0
                a/l = b/m = c/n
                """);
        }
        else {
            System.out.println("""
                al + bm + cn =/= 0
                """);
        }

        return answ;
    }


    public static double[] intersection(MathModel lp) {
        System.out.println("""
            (x - x0)/l = (y - y0)/m = (z - z0)/n = t
            x = lt + x0
            y = mt + y0
            z = nt + z0
            
            ax + by + cz + d = 0

            t = - (ax0 + by0 + cz0 + d)/(al + bm + cn)
        """);
        double[] intersect = lp.intersection();

        return intersect;
    }


    public static void check(double[] a, double[] po, double[] v, double[] pl) {
        System.out.printf("\n(x - x0)/l = (%.2f - %.2f)/%.2f = ", a[0], po[0], v[0]);
        System.out.printf("%.2f", (a[0]-po[0])/v[0]);

        System.out.printf("\n(y - y0)/m = (%.2f - %.2f)/%.2f = ", a[1], po[1], v[1]);
        System.out.printf("%.2f", (a[1]-po[1])/v[1]);

        System.out.printf("\n(z - z0)/n = (%.2f - %.2f)/%.2f = ", a[2], po[2], v[2]);
        System.out.printf("%.2f", (a[2]-po[2])/v[2]);

        System.out.printf("\nax + by + cz + d = %.2f*%.2f + %.2f*%.2f + %.2f*%.2f + %.2f = ", pl[0], a[0], pl[1], a[1], pl[2], a[2], pl[3]);
        System.out.printf("%.2f + %.2f + %.2f + %.2f = ", pl[0]*a[0], pl[1]*a[1], pl[2]*a[2], pl[3]);
        System.out.printf("%.2f", pl[0]*a[0]+pl[1]*a[1]+pl[2]*a[2]+pl[3]);
    }
}
