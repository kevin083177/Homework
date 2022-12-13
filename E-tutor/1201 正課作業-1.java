import java.util.Scanner;    
public class Main{    
    public static void main(String[] args){    
        Scanner input  = new Scanner(System.in);  
        int number = input.nextInt();  
        for(int i=1; i<10; i++){  
            System.out.printf("%d*%d=%02d ", number, i, number * i);  
        }  
        System.out.printf("\n\n");  
        for(int j=0; j<2; j++){  
            for(int i=1; i<10; i++){  
                System.out.printf("%d*%d=%02d\n", i, number, number * i);  
            }  
        }  
    }  
} 