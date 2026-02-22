public class Cususingpre {
    int id;
    String name;
    long mobno;
public Cususingpre (int a,String b,long c){
    id=a;
    name=b;
    mobno =c;
}
public void display(){
    System.out.println(id);
    System.out.println(name);
    System.out.println(mobno);
}
public static void main(String[] args) {
    Cususingpre e1= new Cususingpre(11, "diwa", 9025789321l);
    e1.display();
    Cususingpre e2= new Cususingpre();
    e2.id=101;
    e2.name="shiva";
    e2.name=9025789210l;
}
}