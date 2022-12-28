import java.util.Scanner;

public class trapezoidal_string {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int c = input.nextInt(); //上底
        int n = input.nextInt(); //下底
        if(c<n){ //上底比較短
            for(int i=c; i<=n; i++){ //靠右正梯形 i:控制星星
                System.out.println(" ".repeat(n-i) + "*".repeat(i));
            }
            System.out.println(""); //這行沒任何用處 只是單純換行因為上下兩個梯形會同時輸出 怕搞混
            for(int i=c; i<=n; i++){ //靠左正梯形
                System.out.println("*".repeat(i));
            }
        }
        else{ //上底比較長
            for(int i=0; i<n; i++){ //靠右倒梯形 i:控制空格
                System.out.println(" ".repeat(i) + "*".repeat(c-i));
            }
            System.out.println(""); //這行沒任何用處 只是單純換行因為上下兩個梯形會同時輸出 怕搞混
            for(int i=0; i<n; i++){ //靠左倒梯形
                System.out.println("*".repeat(c-i));
            }
        }
    }
}
