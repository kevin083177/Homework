import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static int toTen(char num){
        int ten;
        if(num >= 'A'){
            ten = 10 + (num - 'A');
        }
        else{
            ten = num - '0';
        }
        return ten;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        int length = number.length();
        int array[] = new int[length];
        double sum = 0;
        for(int i=0; i<length; i++){
            array[i] = toTen(number.charAt(i));
        }
        for(int j=0; j<length; j++){
            sum += array[j] * Math.pow(16, length-j-1);
        }
        System.out.printf("%.0f\n", sum);
    }
}