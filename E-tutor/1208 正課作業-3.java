import java.util.Scanner;      
public class Main{      
    public static void main(String[] args){      
        Scanner input  = new Scanner(System.in);      
        int number = input.nextInt();
        int max = number;
        int sec_max = number;
        while(number!=-1){
            number = input.nextInt();
            if(number > max){
                //sec_max = max;
                max = number;
            }
            if(number < max && number > sec_max){
                sec_max = number;
            }
        }
        System.out.printf("%d %d\n", max, sec_max);
    }      
}