import java.util.Scanner;   
import java.lang.Math;   
public class Main{     
    public static void main(String[] args){     
        Scanner input = new Scanner(System.in);   
        int a = input.nextInt();   
        double b = input.nextDouble();   
        int c = 1;   
        double D = Math.pow(b,2) - 4 * a * c;   
        if(D>0){   
            double x1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);   
            double x2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);   
            System.out.printf("2 roots\n%.3f %.3f\n", x1, x2);   
        }   
        else if(D == 0){   
            double x3 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);   
            System.out.printf("1 root\n%.3f\n", x3);   
        }   
        else{   
            System.out.printf("no root\n");   
        }   
    }     
} 