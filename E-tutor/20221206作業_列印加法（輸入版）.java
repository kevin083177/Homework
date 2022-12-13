import java.util.Scanner;     
public class Main{     
    public static void main(String[] args) {     
        Scanner input = new Scanner(System.in);     
        int i  = input.nextInt();     
        int j = input.nextInt();   
        for(int k=j; k<31; k++){   
            if(k>=0){   
                System.out.printf("%d+%d=%d\n", i, k, i+k);   
            }   
            else{   
                System.out.printf("%d%d=%d\n", i, k, i+k);   
            }   
        }   
    }     
}