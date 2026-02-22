public class static_a{
    static {
        System.out.println("static block");
    }
    public static void static_a(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        System.out.println("main");
        static_a();
    }
}
