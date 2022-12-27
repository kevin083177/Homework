import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i=1; i<=number; i++){ //number = 6 until 6<=6
            for(int j=number; j>=1; j--) //run 6 times.
                //System.out.print(j<=i ? j + " " : "  "); //6<=1 " " ,5<=1 " ", 4" ", 3 " ", 2 " ", 1 '1 '
                                                           //6<=2 " ", ....................., 2 '2 ', 1 '1 '
                if(j==1 && i==1){
                    System.out.print(j<=i ? j : "  ");
                }
                else{
                    System.out.print(j<=i ? j + " " : "  ");
                }
            for(int k=2; k<=i; k++){ //2<2
                //System.out.print(k + "_"); //2<3 "2 " line 17
                                             //2<4 "2 " 3<4 "3 " line 17
                                             //2<5 "2 "      "3 "       "4 " line 17
                if(k % i == 0){
                    System.out.print(k);
                }
                else{
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }
    }
}