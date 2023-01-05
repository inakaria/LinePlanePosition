package org.example;
import java.util.Scanner; 


public class Input {
    public static void inEN() {
        Scanner sc = new Scanner(System.in);
        Calculation sl = new Calculation();
        Output out = new Output();

        System.out.print("Input elements of a line in a canonical form: (x - x0)/l = (y - y0)/m = (z - z0)/n\n");
        System.out.print("x0:");
        double x0 = sc.nextDouble();
        System.out.print("y0:");
        double y0 = sc.nextDouble();
        System.out.print("z0:");
        double z0 = sc.nextDouble();
        System.out.print("l:");
        double l = sc.nextDouble();
        System.out.print("m:");
        double m = sc.nextDouble();
        System.out.print("n:");
        double n = sc.nextDouble();

        System.out.print("Input elements of a plane in a form: ax + by + cz + d = 0\n");
        System.out.print("a:");
        double a = sc.nextDouble();
        System.out.print("b:");
        double b = sc.nextDouble();
        System.out.print("c:");
        double c = sc.nextDouble();
        System.out.print("d:");
        double d = sc.nextDouble();

        System.out.printf("\nYour line: (x - %.2f)/%.2f = (y - %.2f)/%.2f = (z - %.2f)/%.2f", x0, l, y0, m, z0, n);
        System.out.printf("\nYour plane: %.2fx + %.2fy + %.2fz + %.2f = 0", a, b, c, d);

        double[] point = {x0, y0, z0};
        double[] vect = {l, m, n};
        double[] plane = {a, b, c, d};

        MathModel lineplane = new MathModel(point, vect, plane);
        String answ = sl.position(lineplane);
        out.outEN(answ, lineplane);
    }


    public static void inUA() {
        Scanner sc = new Scanner(System.in);
        Calculation sl = new Calculation();
        Output out = new Output();

        System.out.print("Введіть елементи прямої у канонічній формі: (x - x0)/l = (y - y0)/m = (z - z0)/n\n");
        System.out.print("x0:");
        double x0 = sc.nextDouble();
        System.out.print("y0:");
        double y0 = sc.nextDouble();
        System.out.print("z0:");
        double z0 = sc.nextDouble();
        System.out.print("l:");
        double l = sc.nextDouble();
        System.out.print("m:");
        double m = sc.nextDouble();
        System.out.print("n:");
        double n = sc.nextDouble();

        System.out.print("Введіть елементи площини виду: ax + by + cz + d = 0\n");
        System.out.print("a:");
        double a = sc.nextDouble();
        System.out.print("b:");
        double b = sc.nextDouble();
        System.out.print("c:");
        double c = sc.nextDouble();
        System.out.print("d:");
        double d = sc.nextDouble();

        System.out.printf("\nВаша пряма: (x - %.2f)/%.2f = (y - %.2f)/%.2f = (z - %.2f)/%.2f", x0, l, y0, m, z0, n);
        System.out.printf("\nВаша площина: %.2fx + %.2fy + %.2fz + %.2f = 0", a, b, c, d);

        double[] point = {x0, y0, z0};
        double[] vect = {l, m, n};
        double[] plane = {a, b, c, d};

        MathModel lineplane = new MathModel(point, vect, plane);
        String answ = sl.position(lineplane);
        out.outUA(answ, lineplane);
    }
}
