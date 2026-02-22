import java.util.Scanner;
public class reverseString{
    public  reverseString(char[] a){
        System.out.println("revered string");
        for (int i = a.length-1; i >=0; i--) {
            System.out.print(a[i]);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size");
        int size = s.nextInt();
        char [] name = new char[size];
        System.out.println("Enter the string");
        for (int i = 0; i < size; i++) {
            name[i] = s.next().charAt(0);
        }
        for (int i = 0; i < size; i++) {
            System.out.print(name[i]);
        }
        System.out.println();
        reverseString e1 = new reverseString(name);
    }
}