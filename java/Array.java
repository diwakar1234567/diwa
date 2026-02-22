import java.util.*;
public class Array {

    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
        int [] a = new int[4];
        int b =0;
        System.out.println("enter the number");
        for (int i = 0 ; i <a.length ; i++) {

        a[i] = s.nextInt();
      
}
if (a[0] > a[1]) {
    for (int i = 0; i < 4-1; i++) {
        
    b = a[i];
    a[i] = a[i+1];
    a[i+1] = b;
    }
}
System.out.println("the largest number is ");
for (int i = 0; i < 4; i++) {
    System.out.println(a[i]);
    
}
}
}