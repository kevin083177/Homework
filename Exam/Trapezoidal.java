import java.util.Scanner;
public class Trapezoidal{    
    public static void main(String[] args){    
        Scanner input  = new Scanner(System.in);  
        int upper = input.nextInt();
        int lower = input.nextInt();
        int height = lower - upper > 0 ? lower - upper : upper - lower;
        boolean positive = lower - upper > 0 ? true : false;
/*
          ***
         ****
        *****
*/     
        if(positive){
            for(int i=0; i<=height; i++){  
                for(int j=0; j<height-i; j++){
                    System.out.printf(" ");
                }
                for(int j=0; j<upper+i; j++){
                    System.out.printf("*");
                }
                System.out.println("");  
            }  
        }
/*
        *****
         ****
          ***
 */     
        else{
            for(int i=0; i<=height; i++){
                for(int j=0; j<i; j++){
                    System.out.printf(" ");
                }
                for(int j=0; j<upper-i; j++){
                    System.out.printf("*");
                }
                System.out.println("");
            }
        }
        input.close();
    }  
} 
