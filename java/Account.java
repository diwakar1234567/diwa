import java.util.Scanner;
public class Account{
    int id;
    String name;
    long accno;
    Double bal ;
    long mobno;
    static String bname="ICICI";
    public void deposit(int amt){
        bal+=amt;
        System.out.println(bal);
        System.err.println("deposit success");
    }
    public void withdrow(int amt){
        bal-=amt;
        System.out.println(bal);
        System.out.println("withdrow successful");
    }
    public void chkbal(){
        System.out.println(bal);
    }
    public void print(){
        System.out.println("ACCOUNT ID :"+id);
        System.out.println("ACCOUNT NAME :"+name);
        System.out.println("ACCOUNT BALANCE :"+bal);
        System.out.println("ACCOUNT NUMBER :"+accno);
        System.out.println("MOBILE NUMBER :"+mobno);
        System.out.println("BANK NAME :"+bname);
    }
  public static void main(String[] args) {
    System.out.println("1ST PERSON DATA");
    Account a1= new Account();
    a1.id=101;
    a1.accno=123456789101112l;
    a1.mobno=9055664872l;
    a1.bal=200.0;
    a1.name="diwakar";
    System.out.println("DEPOSITED MONEY");
    a1.deposit(2000);
    System.out.println("WITHDROWED MONEY");
    a1.withdrow(200);
    System.out.println("DISPLAY BALANCE");
    a1.chkbal();
    System.out.println("DISPLAY ALL DATA");
    a1.print();
    System.out.println("2ND PERSON DATA");
    Account a2=new Account();
    a2.id=101;
    a2.accno=123456789122212l;
    a2.mobno=9055688872l;
    a2.bal=320.0;
    a2.name="BHUVI";
    System.out.println("DEPOSITED MONEY");
    a2.deposit(5000);
    System.out.println("WITHDROWED MONEY");
    a2.withdrow(100);
    System.out.println("DISPLAY BALANCE");
    a2.chkbal();
    System.out.println("DISPLAY ALL DATA");
    a2.print();
    System.out.println("3RD PERSON DATA");
    Account a3  =new Account();
    a3.id=101;
    a3.accno=123456789546212l;
    a3.mobno=9055689972l;
    a3.bal=990.0;
    a3.name="RAMYA";
    System.out.println("DEPOSITED MONEY");
    a3.deposit(9000);
    System.out.println("WITHDROWED MONEY");
    a3.withdrow(5000);
    System.out.println("DISPLAY BALANCE");
    a3.chkbal();
    System.out.println("DISPLAY ALL DATA");
    a3.print();
    //USING SCANNER DEPOSIT IN A1
    Scanner s = new Scanner(System.in);
    Account a4  =new Account();
    System.out.println("ENTER THE ID :");
    a4.id=s.nextInt();
    System.out.println("ENTER THE ACCOUNT :");
    a4.accno=s.nextLong();
    System.out.println("MOBILE NUMBER :");
    a4.mobno=s.nextLong();
    a4.bal=5490.0;
    System.out.println("NAME :");
    a4.name=s.next();
    System.out.println("ENTER THE DEPOSIT AMMOUNT");
    int amt =s.nextInt();
    a4.deposit(amt);
    System.out.println("DISPLAY ALL DATA");
    a4.print();
  }
}