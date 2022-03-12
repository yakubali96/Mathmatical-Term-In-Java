package SirProject;

public class HoursTime {

    public static void main(String[] args) {
        int sec = 86399;
        int x = sec % 60;
        int y = sec / 60;
        int z = y / 60;
        y = y / 60;
        System.out.println(y + ":" + z + ":" + x);
    }
}
