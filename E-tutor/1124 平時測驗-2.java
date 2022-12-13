import java.lang.Math;    
import java.util.Scanner;    
public class Main{    
    public static int toTen(char number){    
        int ten;    
        switch(number){    
            case 'A': ten = 10; break;    
            case 'B': ten = 11; break;    
            case 'C': ten = 12; break;    
            case 'D': ten = 13; break;    
            case 'E': ten = 14; break;    
            case 'F': ten = 15; break;    
            default: ten = (int)number - '0';    
        }    
        return ten;    
    }    
    public static void main(String[] args){    
        Scanner input  = new Scanner(System.in);    
        String Hexdecimal = input.nextLine();    
        char n1 = Hexdecimal.charAt(0);    
        char n2 = Hexdecimal.charAt(1);    
        int decimal_1 = toTen(n1);    
        int decimal_2 = toTen(n2);    
        double sum_10 = Math.pow(16,1) * decimal_1 + Math.pow(16,0) * decimal_2;    
        System.out.printf("First and second digit: '%s' and '%s'\n", n1, n2);    
        System.out.printf("Their decimal value: %d and %d\n", decimal_1, decimal_2);    
        System.out.printf("The decimal value of the input string: %.0f\n", sum_10);    
    }    
} 