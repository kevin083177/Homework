import java.util.Scanner;  
public class Main{  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  
        int x = input.nextInt();  
        int y = input.nextInt();  
        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d ... %d\n", x, y, (x+y), x ,y, (x-y), x, y, (x*y), x, y, (x/y), (x%y));  
    }  
}  