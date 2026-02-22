import java.util.Scanner;
public class Arrayscanner{
    public static void print(int b[]){
        int max = b[0];
          for (int i = 0; i < b.length; i++) {

            System.out.println(b[i]);
              
          if (b[i] > max)
            max = b[i];  
        }
            System.out.println(max);  
              

    }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter the size of array");
            int size = s.nextInt();
            int a[] = new int[size];
            System.out.println("enter the number of array");
            for (int i = 0; i < size; i++) {
                  
                a[i] = s.nextInt();
            }
            print(a);
        }
}