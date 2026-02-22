
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("    j    a    v     v    a");
        System.out.println("    j   a a    v   v    a a");
        System.out.println(" j  j  aaaaa    v v    aaaaa");
        System.out.println("   jj a     a    v    a     a");
    }
}
