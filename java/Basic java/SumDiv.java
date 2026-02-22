import java.util.Scanner;
public class SumDiv {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to do opraction");
        int a = s.nextInt();
        int b = s.nextInt();
        while (true) { 
        System.out.println("Enter the choice \n 1: Sum \n 2: Division \n 3: Mod \n 4: Product \n 5: Exit");
        int choice = s.nextInt();
       
        switch (choice) {
            case 1 :{
                int Add = a+b;
                System.out.println("Sum of 2 number is "+Add);
            }
            break;
            case 2 :{
                int Div = a/b;
                System.out.println("div of 2 number is "+Div);
            }
            break;
            case 3 :{
                int Mod = a%b;
                System.out.println("mod of 2 number is "+Mod);
            }
            break;
            case 4 :{
                int Product = a*b;
                System.out.println("mult of 2 number is "+Product);
            }
            break;
            case 5 :
                System.out.println("Think You");
                System.exit(0);
            break;
            default:
                System.out.println("Invalid choice");;
        }
    }
    
  }
}
