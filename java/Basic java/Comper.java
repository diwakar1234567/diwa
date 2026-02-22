
import java.util.Scanner;

public class Comper {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if(a==b){
            System.out.printf("%d == %d\n",a,b);
        }
        if(a!=b){
            System.out.printf("%d != %d\n",a,b);
        }
        if(a>=b){
            System.out.printf("%d >= %d\n",a,b);
        }
        if(a<=b){
            System.out.printf("%d <= %d\n",a,b);
        }
        if(a<b){
            System.out.printf("%d < %d\n",a,b);
        }
        if(a>b){
            System.out.printf("%d > %d\n",a,b);
        }
       
    }
}
