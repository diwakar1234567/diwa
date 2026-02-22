
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Width and Hight");
        double width=s.nextDouble();
        double hight=s.nextDouble();
        System.out.println("Area ="+width*hight);
        System.out.println("parameter ="+ 2*(width+hight));

    }
}
