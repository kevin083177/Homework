import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        
        if(distance <= 10 && distance > 0){
            System.out.printf("Point (%.1f, %.1f) is in the circle\n", x, y);
        }
        else{
            System.out.printf("Point (%.1f, %.1f) is not in the circle\n", x, y);
        }
    }
}
