import java.util.Scanner;
import java.lang.Math;       
public class Main{    
    public static boolean Prime(int n) {
        if (n % 2 == 0) {
            return n == 2;
        } 
        else if (n > 2) {     
            for (int i = 3; i <= (int)Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        } 
        else {
            return false;
        }
    }
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);    
        int number = input.nextInt();
        int count = 0;
        for(int i=2; i<number; i++){
            if(Prime(i) == true){
                count++;
                if(count % 10 != 0){
                    System.out.printf("%d ", i);
                }
                else{
                    System.out.printf("%d", i);
                    System.out.println("");
                }
            }
        }
        System.out.printf("\n");
    }
}        