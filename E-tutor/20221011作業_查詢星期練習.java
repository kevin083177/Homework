import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        String days = "";
        System.out.println("Please enter your number(1~7):");
        if(day<1 || day>7){
            System.out.println("Input error. Please try again.");
        }
        else{
            switch(day){
                case 1: days = "Monday"; break;
                case 2: days = "Tuesday"; break;
                case 3: days = "Wednesday"; break;
                case 4: days = "Thursday"; break;
                case 5: days = "Friday"; break;
                case 6: days = "Saturday"; break;
                case 7: days = "Sunday"; break;
            }
            System.out.printf("Number %d is %s.\n", day, days);
        }

    }
}
