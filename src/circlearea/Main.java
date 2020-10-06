package circlearea;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args)
    {
        Locale.setDefault(Locale.ROOT);

        double r1 = readRadius("radius1");
        double r2 = readRadius("radius2");
        double r3 = readRadius("radius3");

        double paintedArea = calcArea(r1, r2, r3);

        printArea(paintedArea);
    }

    static double readRadius(String radius)
    {
        System.out.printf("Input the %s = ", radius);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    static double calcArea(double r1, double r2, double r3)
    {
        return calcDifferenceArea1(r1, r2) + calcDifferenceArea2(r3);
    }

    static double calcDifferenceArea1(double r1, double r2)
    {
        return calcAreaCircle(r2) - calcAreaCircle(r1);
    }

    static double calcDifferenceArea2(double r3)
    {
        return calcAreaSquare(r3) - calcAreaCircle(r3);
    }

    static double calcAreaCircle(double r)
    {
        return Math.PI*r*r;
    }

    static double calcAreaSquare(double r3)
    {
        return 4 * r3 * r3;
    }

    static void printArea(double area)
    {
        System.out.printf("Your result is %.03f%n", area);
    }
}
