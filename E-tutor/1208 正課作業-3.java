import java.util.Scanner;      
public class Main{      
    public static void main(String[] args){      
        Scanner input  = new Scanner(System.in);      
        int []array = new int[6];  
        int temp;  
        for(int i=0; i<6; i++){  
            array[i] = input.nextInt();  
        }  
        for(int i=0; i<5; i++){  
            for(int j=0; j<5; j++){  
                if(array[j]<array[j+1]){  
                    temp = array[j];  
                    array[j] = array[j+1];  
                    array[j+1] = temp;  
                }  
            }  
        }  
        System.out.printf("%d %d\n", array[0], array[1]);  
    }      
} 