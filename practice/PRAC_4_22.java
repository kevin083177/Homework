import java.util.Scanner;
public class PRAC_4_22 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string s1: ");
        String s1 = input.nextLine();
        System.out.println("Enter string s2: ");
        String s2 = input.nextLine();
        System.out.println(s2 + ((s1.contains(s2)) ? " is " : " is not ") + "prefix of " + s1);
    }
}
