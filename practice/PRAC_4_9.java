import java.util.Scanner;

public class PRAC_4_9{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter an character: ");
		String s = input.nextLine();
        char ch = s.charAt(0);

		System.out.println((int)ch);

        input.close();
	}
}