import java.lang.Math;
public class PRAC_4_25 {
    public static void main(String args[]){
        //ABC1234
        //A~Z = 65~90;
        double num_1 = Math.random()*26+65;
        double num_2 = Math.random()*26+65;
        double num_3 = Math.random()*26+65;
        //0~9
        int num_4 = (int)(Math.random()*10);
        int num_5 = (int)(Math.random()*10);
        int num_6 = (int)(Math.random()*10);
        int num_7 = (int)(Math.random()*10);

        String c1 = Character.toString((char)num_1);
        String c2 = Character.toString((char)num_2);
        String c3 = Character.toString((char)num_3);

        System.out.println(c1.concat(c2.concat(c3)) + num_4 + num_5 + num_6 + num_7);
    }
}
