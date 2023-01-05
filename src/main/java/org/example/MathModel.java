package org.example;


public class MathModel {
    //Line
    public double x0;
    public double y0;
    public double z0;

    public double l;
    public double m;
    public double n;

    //Plane
    public double a;
    public double b;
    public double c;
    public double d;


    public MathModel(double[] point, double[] vector, double[] plane) {
        this.x0 = point[0];
        this.y0 = point[1];
        this.z0 = point[2];

        this.l = vector[0];
        this.m = vector[1];
        this.n = vector[2];

        this.a = plane[0];
        this.b = plane[1];
        this.c = plane[2];
        this.d = plane[3];
    }


    public String position() {
        String answ;

        //If al+bm+cn=0, then the line belongs/is parallel to a plane
        if (a*l + b*m + c*n == 0) {
            //If al+bm+cn+d=0 then the line belongs to a plane
            if (a*l + b*m + c*n + d == 0) {
                answ = "belongs";
            } 
            //If al+bm+cn+d=/=0 then the line is parallel to a plane
            else {
                answ = "parallel";
            }
        } 
        //If a/l=b/m=c/n і al+bm+cn=/=0, then the line is perpendicular to a plane
        else if (a/l == b/m && b/m == c/n) {
            answ = "perpendicular";
        } 
        //If al+bm+cn=/=0, then the line intersects a plane
        else {
            answ = "intersect";
        }

        return answ;
    }


    public double[] intersection() {
        double t = -(a*x0 + b*y0 + c*z0 + d)/(a*l + b*m + c*n);

        double x = l*t + x0;
        double y = m*t + y0;
        double z = n*t + z0;

        double[] intersect = {x, y, z};

        return intersect;
    }

    public String check(double[] i) {
        String t1 = String.format("\n(x - x0)/l = (%.2f - %.2f)/%.2f = %.2f", i[0], x0, l, (i[0]-x0)/l);
        String t2 = String.format("\n(y - y0)/m = (%.2f - %.2f)/%.2f = %.2f", i[1], y0, m, (i[1]-y0)/m);
        String t3 = String.format("\n(z - z0)/n = (%.2f - %.2f)/%.2f = %.2f", i[2], z0, n, (i[2]-z0)/n);

        String e = String.format("""

            \nax + by + cz + d = %.2f*%.2f + %.2f*%.2f + %.2f*%.2f + %.2f = 
            %.2f + %.2f + %.2f + %.2f = %.2f
            """, a, i[0], b, i[1], c, i[2], d, a*i[0], b*i[1], c*i[2], d, a*i[0] + b*i[1] + c*i[2] + d);

        return t1+t2+t3+e;
    }
}
