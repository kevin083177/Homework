import java.util.Scanner;

public class Trapezoidal {    
    public static void main(String[] args){    
        Scanner input  = new Scanner(System.in);  
        int upper = input.nextInt();
        int bottom = input.nextInt();
        int height = bottom - upper > 0 ? bottom - upper : upper - bottom; //確保高度為正
        boolean positive = bottom - upper > 0 ? true : false; //判斷要用正/倒梯形
/*
          ***
         ****      靠右正梯形
        *****
*/     
        if(positive)
            for(int i=0; i<=height; i++){
                for(int j=0; j<height-i; j++){
                    System.out.printf(" ");
                }
                for(int j=0; j<upper+i; j++){
                    System.out.printf("*");
                }
                System.out.println("");  
            }
/*
        *****
         ****      靠右倒梯形
          ***
 */     
        else
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
} 
