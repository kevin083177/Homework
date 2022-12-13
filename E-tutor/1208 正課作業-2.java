import java.util.Scanner;       
public class Main{    
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);    
        int number = input.nextInt();    
        boolean isPrime = true;    
        int i = 2;    
        while(i<number-1 && isPrime){    
            if(number % i == 0){    
                isPrime = false;    
                break;    
            }    
            i++;    
        }    
        if(isPrime){    
            System.out.println("Y");    
        }    
        else{    
            System.out.println("N");    
        }    
    }    
        
}  