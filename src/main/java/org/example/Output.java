package org.example;
import java.util.Scanner;


public class Output {
    public static void outEN(String answer, MathModel lp) {
        Calculation sl = new Calculation();
        WriteJSON wjson = new WriteJSON();
        Scanner sc = new Scanner(System.in);

        String eq1 = String.format("(x - %.2f)/%.2f = (y - %.2f)/%.2f = (z - %.2f)/%.2f", lp.x0, lp.l, lp.y0, lp.m, lp.z0, lp.n);
        String eq2 = String.format("%.2fx + %.2fy + %.2fz + %.2f = 0", lp.a, lp.b, lp.c, lp.d);

        if (answer == "belongs") {
            System.out.println("\nThe line belongs to the plane");
            wjson.write("Line", eq1, "Plane", eq2, "Answer", "The line belongs to the plane");
        }
        else if (answer == "parallel") {
            System.out.println("\nThe line is parallel to the plane");
            wjson.write("Line", eq1, "Plane", eq2, "Answer", "The line is parallel to the plane");
        }
        else {
            double[] ints = sl.intersection(lp);
            System.out.printf("The point of intersection is (%.2f, %.2f, %.2f)", ints[0], ints[1], ints[2]);
            String i = String.format("The point of intersection is (%.2f, %.2f, %.2f)", ints[0], ints[1], ints[2]);

            if (answer == "perpendicular") {
                System.out.println("\nThe line is perpendicular to the plane");
                wjson.write("Line", eq1, "Plane", eq2, "Answer", "The line is perpendicular to the plane. " + i);
            }
            else {
                System.out.println("\nThe line intersects the plane");
                wjson.write("Line", eq1, "Plane", eq2, "Answer", "The line intersects the plane. " + i);
            }

            System.out.println("\nPress 0 to check the solution");
            int ch = sc.nextInt();

            if (ch == 0) {
                System.out.println(lp.check(ints));
            }
        }
    }


    public static void outUA(String answer, MathModel lp) {
        Calculation sl = new Calculation();
        WriteJSON wjson = new WriteJSON();
        Scanner sc = new Scanner(System.in);

        String eq1 = String.format("(x - %.2f)/%.2f = (y - %.2f)/%.2f = (z - %.2f)/%.2f", lp.x0, lp.l, lp.y0, lp.m, lp.z0, lp.n);
        String eq2 = String.format("%.2fx + %.2fy + %.2fz + %.2f = 0", lp.a, lp.b, lp.c, lp.d);

        if (answer == "belongs") {
            System.out.println("\nПряма належить площині");
            wjson.write("Пряма", eq1, "Площина", eq2, "Відповідь", "Пряма належить площині");
        }
        else if (answer == "parallel") {
            System.out.println("\nПряма паралельна площині");
            wjson.write("Пряма", eq1, "Площина", eq2, "Відповідь", "Пряма паралельна площині");
        }
        else {
            double[] ints = sl.intersection(lp);
            System.out.printf("Точка перетину (%.2f, %.2f, %.2f)", ints[0], ints[1], ints[2]);
            String i = String.format("Точка перетину (%.2f, %.2f, %.2f)", ints[0], ints[1], ints[2]);

            if (answer == "perpendicular") {
                System.out.println("\nПряма перепендикулярна до площини");
                wjson.write("Пряма", eq1, "Площина", eq2, "Відповідь", "Пряма перепендикулярна до площини. " + i);
            }
            else {
                System.out.println("\nПряма перетинає площину");
                wjson.write("Пряма", eq1, "Площина", eq2, "Відповідь", "Пряма перетинає площину. " + i);
            }

            System.out.println("\nНатисніть 0 для перевірки");
            int ch = sc.nextInt();

            if (ch == 0) {
                System.out.println(lp.check(ints));
            }
        }
    }
}
