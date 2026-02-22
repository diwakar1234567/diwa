public class AscendingOrder {
        public static void main(String[] args){
            int [] a = {6,8,3,1};
            int n = a.length;
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (a[j] > a[j+1]) {
                        int temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                }
            }
            System.out.println("Array in ascending order:");
            for (int i = 0; i < n; i++) {
                System.out.println(a[i]);
            }
        }
    }


