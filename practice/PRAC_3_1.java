import java.util.Scanner;
import java.lang.Math;

public class PRAC_3_1{
    public static void main(String args[]){
        System.out.println("Enter a, b, c: ");
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double determin = Math.pow(b, 2) - 4 * a * c;
        double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        if(determin > 0){
            System.out.printf("The equation has two roots %.6f and %.6f", r1, r2);
        }
        else if (determin == 0){
            System.out.printf("The equation has one root %.1f", r1);
        }
        else{
            System.out.println("The equation has no real roots");
        }
        input.close();
    }
}