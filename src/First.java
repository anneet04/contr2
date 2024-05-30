import java.util.Scanner;

public class First {
    public static double distance(int x1, int y1, int x2, int y2){
        float p1 = (float)Math.abs(x1 - x2);
        float p2 = (float)Math.abs(y1 - y2);
        double dis = Math.sqrt(p1 * p1 + p2 * p2);

        return dis;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(distance(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()));
    }
}
