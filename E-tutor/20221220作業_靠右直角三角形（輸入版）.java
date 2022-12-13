import java.util.Scanner;    
public class Main{    
    public static void main(String[] args){    
        Scanner input  = new Scanner(System.in);  
        int number = input.nextInt();  
        char star = '*';  
        for(int i=0; i<number; i++){  
            for(int k=0; k<number-i-1; k++){  
                System.out.printf(" ");  
            }  
            for(int j=0; j<=i; j++){  
                System.out.printf("%c", star);  
            }  
            System.out.printf("\n");  
        }  
    }  
} 