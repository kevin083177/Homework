import java.util.Scanner;
public class Mid4_411630907{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入一個含4位數的2進位字串：");
        String number = input.nextLine();

        if(number.length() != 4){
            System.out.println("長度不是4");
        }
        else{
            int sum_10 = 0;
            String sum_16 = "";
            int n1 = (int)number.charAt(0) - '0';
            int n2 = (int)number.charAt(1) - '0';
            int n3 = (int)number.charAt(2) - '0';
            int n4 = (int)number.charAt(3) - '0';

            sum_10 = (int)(Math.pow(2,3) * n1 + Math.pow(2,2) * n2 + Math.pow(2,1) * n3 + Math.pow(2,0) * n4);
            switch(sum_10){
                case 10: sum_16 = "A"; break;
                case 11: sum_16 = "B"; break;
                case 12: sum_16 = "C"; break;
                case 13: sum_16 = "D"; break;
                case 14: sum_16 = "E"; break;
                case 15: sum_16 = "F"; break;
                default: sum_16 = String.valueOf(sum_10);
            }
            System.out.printf("其10進位值：%d\n其16進位值：%s", sum_10, sum_16);
        }
    }
}