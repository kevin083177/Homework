import java.lang.Math;
public class Mid2_411630907{
    public static void main(String[] args){
        int x1 = (int)(Math.random()*10);
        int x2 = (int)(Math.random()*10);
        int x3 = (int)(Math.random()*10);
        int y1 = (int)(Math.random()*10);
        int y2 = (int)(Math.random()*10);
        int y3 = (int)(Math.random()*10);

        double s1 = Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2, 2));
        double s2 = Math.sqrt(Math.pow(x2 - x3,2) + Math.pow(y2 - y3, 2));
        double s3 = Math.sqrt(Math.pow(x3 - x1,2) + Math.pow(y3 - y1, 2));

        double s = (s1 + s2 +s3 ) / 2;
        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));

        System.out.printf("三邊長為：%.2f %.2f %.2f\ns為：%.2f\n面積為：%.2f", s1, s2, s3, s, area);
    }
}