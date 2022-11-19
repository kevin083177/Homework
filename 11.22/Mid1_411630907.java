public class Mid1_411630907{
    public static void main(String[] args){
        long totalMillies = System.currentTimeMillis();
        long totalSeconds = totalMillies / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        long totalDays = totalHours / 24;
        long currentDay = totalDays % 365;
        long totalYears = totalDays / 365;

        System.out.printf("%3d年%3d日%3d時%3d分%3d秒",totalYears, currentDay, currentHour, currentMinute, currentSecond);
    }
}