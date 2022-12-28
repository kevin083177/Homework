import java.util.Scanner;      
public class max_time{      
    public static void main(String[] args){      
        Scanner input  = new Scanner(System.in);      
        int number = input.nextInt();
        int max = number;
        int count = 0; //設計數為0
        while(number!=-1){ //輸入-1執行完下面後跳出while
            number = input.nextInt();
            if(number > max){
                max = number;
                count = 0; //最大值改變 計數重設
            }
            if(number == max){  //在第一次的時候因為number==max
                count++;        //所以count=1
            }
        }
        System.out.printf("max = %d, count = %d\n", max, count);
    }      
}