import java.util.Scanner;      
public class max_time{      
    public static void main(String[] args){      
        Scanner input  = new Scanner(System.in);      
        int number = input.nextInt();
        int max = number;
        //int sec_max = number;
        int count = 0;
        while(number!=-1){
            number = input.nextInt();
            if(number > max){
                //sec_max = max;
                max = number;
                count = 0;
            }
            if(number == max){
                count++;
            }
            /*
            if(number < max && number > sec_max){
                sec_max = number;
            }
            */
        }
        System.out.printf("max = %d, count = %d\n", max, count);
        input.close();
    }      
}