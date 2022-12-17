import java.util.Scanner;  
import java.lang.Math;  
  
public class Main{  
    public static int toTen(char num){  //副程式(函數) //num = 'A'
        int ten;
        if(num >= 'A'){   //'A' >= 'A'
            ten = 10 + (num - 'A');  
        }  
        else{  
            ten = num - '0';  
        }  
        return ten; //10
    }
    /*
        public static (回傳的資料型態) (函數名稱)(要將甚麼東西進行轉換){
            宣告一個數
            return 那個數
        }
    */
    /*
        array[] = new int[4];    [0,1,2,3]
        array[3] = 3;
     */
    public static void main(String[] args){  //主程式
        Scanner input = new Scanner(System.in);  
        String number = input.nextLine(); //A564 
        int length = number.length();  //4
        int array[] = new int[length]; //array[] = new int[4]  
        double sum = 0;  
        for(int i=0; i<length; i++){   //4
            array[i] = toTen(number.charAt(i));  //toTen(A) = 10, array[0] = 10, array[1] = 5, array[2] = 6, array[3] = 4
        }
        for(int j=0; j<length; j++){  
            sum += array[j] * Math.pow(16, length-j-1);  //10*16^3 5*16^2 6*16^1 4*16^0
        } 

        System.out.printf("%.0f\n", sum);  
    }  
}