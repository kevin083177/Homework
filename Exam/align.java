import java.util.Scanner;
public class align{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i=0; i<number; i++){
            System.out.printf("%-5d%-5d%d\n", i, i*i, i*i*i);
        }
    }
}
