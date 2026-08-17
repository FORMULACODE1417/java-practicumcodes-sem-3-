import java.util.*;
public class bank {
    String name;
    long accno;
    double balance;
    
    
    public void getdetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Name: ");
        name=sc.nextLine();
        System.out.println("enter account number: ");
        accno=sc.nextLong();
        System.out.println("enter balance: ");
        balance=sc.nextDouble();
    }
    public void deposit(double amount){
        balance=balance+amount;
    }
    public void withdraw(double withdraw){
        if(withdraw>balance){
             System.out.println("insufficient balance");
        }
        else{
            balance-=withdraw;
        }
    }
    public void details(){
        System.out.println("name of the acc holder: "+name);
        System.out.println("account number:"+accno);
        System.out.println("current balance:"+balance);

        
    }
    public static void main(String[]args){
        bank a=new bank();
        a.getdetails();
        a.deposit(200);
        a.withdraw(1000);
        a.details();

    }


}
