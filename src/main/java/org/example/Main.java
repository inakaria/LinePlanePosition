package org.example;
import java.util.Scanner; 


public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Input in = new Input();
            System.out.print("""
                Select the language/Оберіть мову: 
                1 - English
                2 - Ukrainian
                Other - Exit\n""");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    in.inEN();
                    break;
                case 2:
                    in.inUA();
                    break;
                default:
                    break;
            }
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }
}
