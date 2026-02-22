
import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
        //Method 2 
        Scanner s=new Scanner(System.in);
        int x =s.nextInt();
        int y =s.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x+" "+y);
    }
}
