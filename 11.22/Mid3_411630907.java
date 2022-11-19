import java.util.Scanner;
public class Mid3_411630907{
    public static double c(double weight){
        double cost = 0;
        if(weight>0 && weight<=5){
            cost = 4.5;
        }
        else if (weight>5 && weight<=10){
            cost = 7.5;
        }
        else{
            cost = 7.5 + (weight-7.5) * 0.5;
        }
        return cost;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入3個包裹的重量：");
        double package_1 = input.nextDouble();
        double package_2 = input.nextDouble();
        double package_3 = input.nextDouble();
        double cost_1 = c(package_1);
        double cost_2 = c(package_2);
        double cost_3 = c(package_3);

        System.out.printf("%-10s %-10s\n%-10.1f %-10.1f\n%-10.1f %-10.1f\n%-10.1f %-10.1f\n", "weight", "cost", package_1, cost_1, package_2, cost_2, package_3, cost_3);
    }
}