import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float distance = input.nextFloat();
        float miles = input.nextFloat();
        float price = input.nextFloat();
        double cost = distance / miles * price;
        System.out.printf("The cost of driving is $%.2f\n", cost);
    }
}
