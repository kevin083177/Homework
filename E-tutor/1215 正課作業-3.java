import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i=1; i<=number; i++){
            for(int j=number; j>=1; j--)
            if(j==1 && i==1){
                System.out.print(j<=i ? j : "  ");
            }
            else{
                System.out.print(j<=i ? j + " " : "  ");
            }
            for(int k=2; k<i+1; k++){
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