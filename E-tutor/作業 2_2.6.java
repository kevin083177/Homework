import java.util.Scanner;    
import java.lang.Math;    
public class Main{      
    public static void main(String[] args){      
        Scanner input = new Scanner(System.in);    
        String number = input.nextLine();    
        int length = number.length();    
        int sum = 0;    
        for(int i=0; i<length; i++){    
            sum += (int)(number.charAt(i) - '0');    
        }    
        System.out.printf("The sum of the digits is %d\n", sum);    
    }      
}  