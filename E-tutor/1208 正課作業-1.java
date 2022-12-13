import java.util.Scanner;       
public class Main{    
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);    
        int cap = 0;    
        int steal = input.nextInt();    
            
        while(cap<steal){    
            cap += 25;    
            steal += 15;    
        }    
            
        System.out.printf("%d %d\n", cap, steal);    
    }    
        
}