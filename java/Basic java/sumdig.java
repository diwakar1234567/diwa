
import java.util.Scanner;

public class sumdig {
    public sumdig(int m){
        int sum=0;
        while (m!=0) {
            sum+=m%10;
            m /= 10; 
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        sumdig a=new sumdig(n);
        System.out.println(a);
    }
}