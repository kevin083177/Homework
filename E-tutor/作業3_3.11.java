import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int year = input.nextInt();
        int day = 0;
        String MONTH = "";
        switch(month){
            case 1: day = 31; MONTH = "January"; break;
            case 2: day = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 ) ? 29 : 28; MONTH = "February"; break;
            case 3: day = 31; MONTH = "March"; break;
            case 4: day = 30; MONTH = "April"; break;
            case 5: day = 31; MONTH = "May"; break;
            case 6: day = 30; MONTH = "June"; break;
            case 7: day = 31; MONTH = "July"; break;
            case 8: day = 31; MONTH = "August"; break;
            case 9: day = 30; MONTH = "September"; break;
            case 10: day = 31; MONTH = "October"; break;
            case 11: day = 30; MONTH = "November"; break;
            case 12: day = 31; MONTH = "December"; break;
        }
        System.out.printf("%s %d has %d days\n", MONTH, year, day);
    }
}