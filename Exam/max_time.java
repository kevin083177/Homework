import java.util.Scanner;      
public class max_time{      
    //modified: 1208 正課作業-3
    //output: max value and max appear time
    public static void main(String[] args){      
        Scanner input  = new Scanner(System.in);      
        int number = input.nextInt();
        int max = number;
        //int sec_max = number;
        int count = 0;
        while(number!=-1){ //輸入-1停止
            number = input.nextInt();
            if(number > max){
                //sec_max = max;
                max = number;
                count = 0; //最大值改變 計數重設
            }
            if(number == max){  //在第一次的時候因為number==max所以count=1
                count++;
            }
            /*
            if(number < max && number > sec_max){
                sec_max = number;
            }
            */
        }
        System.out.printf("max = %d, count = %d\n", max, count);
    }      
}