public class non_static {
    {
        System.out.println("non static block");
    }
    public non_static(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        System.out.println("main");
        non_static e1 = new non_static();
    }
}
