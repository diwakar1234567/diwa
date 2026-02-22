
import java.util.Scanner;

public class Circle{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radious");
        double radious = s.nextDouble();
         double area = Math.PI *radious*radious;
         double parameter = 2*Math.PI*radious;
         System.out.println(area);
         System.out.println(parameter);

    }
}