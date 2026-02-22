import java.util.Scanner;
public class lesser{
    public static void printmax(int b[]){
        int max = b[0];
        for(int i = 0;i <b.length;i++){
            if(b[i]>max){
                max = b[i];
            }
        }
        System.out.println("maximum number is :\n"+ max);
    }
    public static void printmin(int b[]){
        int min = b[0];
        for(int i = 0;i <b.length;i++){
            if(b[i]<min){
                min = b[i];
            }
        }
        System.out.println("minimum number is :\n"+ min);
    }
    public static void printeven(int b[]){
        System.out.println("even number is :");
        for(int i = 0;i <b.length;i++){
            if(b[i]%2==0){
                System.out.println( b[i]);
            }
        }
    }
    public static void printodd(int b[]){
        System.out.println("odd number is :");
        for(int i = 0;i <b.length;i++){
            if(b[i]%2!=0){
                System.out.println(b[i]);
            }
        }
    }
    public static void printoddindex(int b[]){
        System.out.println("oddindex number is :");
        for(int i = 0;i <b.length;i++){
            if(i%2!=0){
                System.out.println(i+":"+ b[i]);
            }
        }
    }
    public static void printevenindex(int b[]){
        System.out.println("evenindex number is :");
        for(int i = 0;i <b.length;i++){
            if(i%2==0){
                System.out.println(i+":"+ b[i]);
            }
        }
    }
    public static void printprime(int b[]){
        System.out.println("prime number is :");
        int count = 0;
        int num;
        for(int i = 0;i <b.length;i++){
            num = b[i];
            count = 0;
            for(int j =1;j<=num;j++) {
                if(num%j==0){
                    count++;
                }
            }
            if (count == 2)
            {
                System.out.println(b[i]);
            }    
        }
    }
    public static void integer(int b[]) {
        int number = 0;
        
        for (int i = 0; i < b.length; i++) {
            number = number * 10 + b[i]; 
        }
        
        System.out.println("Converted number: " + number);
    }
    public static void printfact(int b[]){
        System.out.println("factorial of number is :");
        int fact =b[0];
        for(int i = 0;i <b.length;i++){
            fact*=b[i];
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = s.nextInt();
        int a[] = new int[size];
        System.out.println("enter the array eliment");
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        
        printmin(a);
        printmax(a);
        printeven(a);
        printodd(a);
        printevenindex(a);
        printoddindex(a);
        printprime(a);
        printfact(a);
        integer(a);
    }
}