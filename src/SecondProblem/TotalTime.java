package SecondProblem;
//Write a Java program to convert seconds to hour, minute and seconds.

public class TotalTime {

    public static void main(String[] args) {
        int totalSec = 86399;
        int second = 86399 % 60;
        int totalMin = totalSec / 60;
        int min = totalMin % 60;
        int hour = totalMin / 60;
        System.out.println(hour + ":" + min + ":" + second);
    }
}
