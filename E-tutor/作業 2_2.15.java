import java.util.Scanner;

public class Main{  //Test Data Error
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.printf("The distance between the two points is %.15f\n", distance);
     }
}
