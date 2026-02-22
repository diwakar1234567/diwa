import java.util.Scanner;
public class MultiOpc{
    public static void evennum(int a,int b) {

        for (int i = a; i <=b; i++){

            if(i%2==0) {
                System.err.println(i);
            }
            
        }
        
    }
    public static void prime(int a) {
        int b = 0;
        for (int i = 1; i<=a; i++){
            if (a%i==0) {
                b++;
            }
        }
        if (b==2) {
            System.out.println("is prime number");
            
        } else {
            System.out.println("not a prime number");
        }
    }
    public static void palandrom(int num) {
     int temp = num;
     int rev = 0;
     while (num!=0) { 
        int rem = num%10;
        rev= rev*10+rem;
        num/=10;
    }
    if (temp==rev) {
        System.out.println("is palandrom");
    } else {
    System.out.println("not a palandrom");
    }
    }
    public static void sumodd(int a,int b) {
        int sum = 0;
        for (int i = a; i <=b; i++) {
            if (i%2==1) {
                sum+=i;
            }
        }            System.out.println("sum of odd number range of "+a+"and"+b+ "is"+sum);

    }
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) { 
        System.out.println("opctions \n 1:even number \n 2:prime number \n 3:palandrom \n 4:sum of odd number \n 5:exit");
        System.out.println("Enter your choice:");
        int choicd = s.nextInt();

        switch (choicd) {
            case 1 :{
                System.out.println("enter the 1st range");
                int a =s.nextInt();
                System.out.println("enter 2nd range ");
                int b =s.nextInt();
                evennum(a, b);
            }   
                break;
                case 2 :
        {        System.out.println("enter the number");
                int a =s.nextInt();
                prime(a);
        }    
                break;
                case 3 :
                System.out.println("enter the number");
                int num =s.nextInt();
                palandrom(num);
                break;
                case 4 :{
                System.out.println("enter the 1st range");
                int a =s.nextInt();
                System.out.println("enter 2nd range ");
                int b =s.nextInt();
                sumodd(a,b);
            }
                break;
                case 5 :
                System.out.println("THANK YOU");
                System.exit(0);
                break;
            default:
                System.out.println("invalid choice");
        }

    }
   }





}