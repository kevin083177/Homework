import java.util.Scanner;
public class HW_3_8_411630907 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three intergers");
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a>b){
            if(b>c){
                System.out.printf("%d %d %d", c, b, a);
            }
            else{ //c>b
                if(a>c){
                    System.out.printf("%d %d %d", b, c, a);
                }
                else{ //c>a
                    System.out.printf("%d %d %d", b, a, c);
                }
            }
        }
        else{ //b>a
            if(a>c){
                System.out.printf("%d %d %d", c, a, b);
            }
            else{ //c>a
                if(b>c){
                    System.out.printf("%d %d %d", a, c, b);
                }
                else{ //c>b
                    System.out.printf("%d %d %d", a, b, c);
                }
            }
        }
    }
}
