import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static String distinguish(int number){
        if(number == 0){
            return "scissor";
        }
        else if(number == 1){
            return "rock";
        }
        else{ //number == 2
            return "paper";
        }
    }
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        
        int player = input.nextInt();
        int computer = (int)(Math.random()*3); //0 <= x < 3

        String player_type = distinguish(player);
        String computer_type = distinguish(computer);
        // judge
        if(player == computer){ //draw
            System.out.printf("The computer is %s. You are %s too. It is a draw\n",computer_type, player_type);
        }
        else if(Math.abs(player - computer) == 2){
            if(player > computer){ //computer win
                System.out.printf("The computer is %s. You are %s. Computer won\n",computer_type, player_type);
            }
            else{ //player win
                System.out.printf("The computer is %s. You are %s. You won\n",computer_type, player_type);
            }
        }
        else{
            if(player > computer){ //player win
                System.out.printf("The computer is %s. You are %s. You won\n",computer_type, player_type);
            }
            else{ //computer win
                System.out.printf("The computer is %s. You are %s. Computer won.",computer_type, player_type);
            }
        }
    }
}
