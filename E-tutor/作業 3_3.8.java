import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int array[] = new int[3];
        for(int i=0; i<3; i++){
            array[i] = input.nextInt();
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(array[i] < array[j]){
                    int temp;
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.printf("[%d, %d, %d]\n", array[0], array[1], array[2]);
    }
}
