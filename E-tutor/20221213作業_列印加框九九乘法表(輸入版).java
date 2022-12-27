import java.util.Scanner;    
public class Main{      
    public static void main(String[] args){      
        Scanner input = new Scanner(System.in);    
        int num = input.nextInt();    
        if(num < 1 || num > 9){    
            System.out.println("input error");    
        }    
        else{    
            for(int i=1; i<10; i++){    
                for(int j=num; j<10; j++){    
                    System.out.printf("|%d*%d=%2d",j, i, j*i);    
                }    
                System.out.println("|");    
            }    
        }    
    }      
}  