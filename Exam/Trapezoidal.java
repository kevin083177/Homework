import java.util.Scanner;
public class trapezoidal{    
    public static void main(String[] args){    
        Scanner input  = new Scanner(System.in);  
        int upper = input.nextInt();
        int bottom = input.nextInt();
        int height = bottom - upper > 0 ? bottom - upper : upper - bottom;
        boolean positive = bottom - upper > 0 ? true : false;
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
