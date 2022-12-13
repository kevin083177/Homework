import java.util.Scanner;    
import java.lang.Math;    
public class Main{      
    public static void main(String[] args){      
        Scanner input = new Scanner(System.in);    
        double length = input.nextDouble();    
    
        double area = Math.sqrt(3) * Math.pow(length,2) / 4;    
        double volume = area * length;    
        System.out.printf("The area is %.2f\nThe volume of the Triangular prism is %.2f\n", area, volume);    
    }      
}  