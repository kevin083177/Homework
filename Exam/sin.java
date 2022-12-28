import java.util.Scanner;
public class sin {
    public static int factorial(int n){
        int factorial = 1;
        for(int i=n; i>0; i--) {
            factorial *= i;
        }
        return factorial;
    }
    //(2n+1)!
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long sum = 0;
        
        for(int i=0; i<n; i++){
            sum += factorial(2*i+1);
        }
        System.out.println(sum);
    }
}
