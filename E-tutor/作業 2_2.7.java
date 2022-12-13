import java.util.Scanner;    
public class Main{      
    public static void main(String[] args){      
        Scanner input = new Scanner(System.in);    
        long minutes = input.nextLong();    
        long hours = minutes / 60;    
        long days = hours / 24;    
        long years = days / 365;    
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days % 365 + "days");    
    }      
}  