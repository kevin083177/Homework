import java.util.Scanner;
import java.lang.Math;
public class PRAC_4_11 {
    public static void main(String args[]){
        System.out.println("Enter binary digits (0000 to 1111): ");
        Scanner input = new Scanner(System.in);

        int sum = 0;

        String s = input.nextLine();
        for(int i = 0; i<s.length(); i++){
            char digits = s.charAt(i);
            int num = digits - '0';
            if(s.length() - i - 1 > 0){
                sum += num * Math.pow(2, s.length() - i - 1);
            }
            else{
                sum += num;
            }
        }
        System.out.println(sum);
        input.close();
    }
}
