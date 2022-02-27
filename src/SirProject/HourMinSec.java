package SirProject;

public class HourMinSec {

    public static void main(String[] args) {
        int sec = 86399;
        int p1 = sec % 60;
        int p2 = sec / 60;
        int p3 = p2 / 60;
        p2 = p2 / 60;
        System.out.println(p2 + ":" + p3 + ":" + p1);
    }
}
