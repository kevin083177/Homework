import java.util.Scanner;    
import java.lang.Math;    
    
public class Main{  
    public static void main(String[] arags){    
        Scanner input = new Scanner(System.in);    
        int a = input.nextInt();  
        int b = input.nextInt();  
        int c = input.nextInt();  
        int S = (a + b + c) / 2;  
        double area = Math.sqrt(S * (S-a) * (S-b) * (S-c));  
          
        System.out.printf("Max(%d, %d, %d)=%d\n", a, b, c ,Math.max(Math.max(a, b), c));  
        System.out.printf("Min(%d, %d, %d)=%d\n", a, b, c, Math.min(Math.min(a, b), c));  
        System.out.printf("Three sides of triangles are %d, %d, %d\n", a, b, c);  
        System.out.printf("**Perimeter of triangle is %d\n", a+b+c);  
        System.out.printf("**Area of triangle is %.5f\n", area);  
    }    
}  