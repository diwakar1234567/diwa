public class nonstaticcun {
    int id;
    String name;
    String email;
    public nonstaticcun(){
        System.out.println("constructor");
    }
    public nonstaticcun(int a){
        System.out.println("constructor with int");
    }
    public nonstaticcun(int id,String name,String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public void 32.2
    
    display(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("email: "+email);
    }
    public static void main(String[] args) {
        System.out.println("main");
        nonstaticcun e1 = new nonstaticcun(101,"diwa","diwa@gmail.com");
        e1.display();
    }
}
