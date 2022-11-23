import java.util.Scanner;
public class Mid3_411630907{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入3個包裹的重量：");
        double package_1 = input.nextDouble();
        double package_2 = input.nextDouble();
        double package_3 = input.nextDouble();
        double cost_1 = 0;
        double cost_2 = 0;
        double cost_3 = 0;
        //package_1
        if(package_1>0 && package_1<=5){
            cost_1 = 4.5;
        }
        else if (package_1>5 && package_1<=10){
            cost_1 = 7.5;
        }
        else{
            cost_1 = 7.5 + (package_1-7.5) * 0.5;
        }
        //package_2
        if(package_2>0 && package_2<=5){
            cost_2 = 4.5;
        }
        else if (package_2>5 && package_2<=10){
            cost_2 = 7.5;
        }
        else{
            cost_2 = 7.5 + (package_2-7.5) * 0.5;
        }   
        //package_3
        if(package_3>0 && package_3<=5){
            cost_3 = 4.5;
        }
        else if (package_1>5 && package_3<=10){
            cost_3 = 7.5;
        }
        else{
            cost_3 = 7.5 + (package_3-7.5) * 0.5;
        }
        System.out.printf("%-10s %-10s\n%-10.1f %-10.1f\n%-10.1f %-10.1f\n%-10.1f %-10.1f\n", "package_1", "cost_1_1", package_1, cost_1_1_1, package_2, cost_1_1_2, package_3, cost_1_1_3);
    }
}