package ATMMachine;
import java.util.*;

class ATM{
    float balance;
    int Pin = 5674;

    public void checkPin(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enterPin = sc.nextInt();
        if (enterPin==Pin){
            menu();
        }else {
            System.out.println("Enter a valid pin");
        }
    }
    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1.Check a/c balance \n2.Withdrow Money \n3.Deposite Money\n4.EXIT ");
        Scanner sc = new Scanner(System.in);
        int option =sc.nextInt();
        if(option==1){
            checkBalence();
        } else if (option==2) {
            withdrawMoney();
        } else if (option==3) {
            depositeMoney();
        } else if (option==4) {
            System.out.println("Exiting...");
            return;
        }else {
            System.out.println("Enter a valid choice ");
        }
    }
    public void checkBalence(){
        System.out.println("Balance: "+balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("ENTER AMOUNT TO WITHDROW: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount>balance){
            System.out.println("Insuficiebt Balencec");
        }else {
            balance= balance-amount;
            System.out.println("Money Withdrow Successfully");
        }
        menu();
    }
    public void depositeMoney(){
        System.out.println("Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance= balance+amount;
        System.out.println("Money Deposite Successfully");
        menu();
    }
}

public class ATMMachine {
    public static void main(String[] args){
        ATM obj = new ATM();
        obj.checkPin();
    }
}
