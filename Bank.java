
import java.util.Scanner;
class CustomerInfo
{
   public String accountHolderName="Scott";
   public int accountNumber=123;
   public int balance=1000;

public void customerInfo()
{
    System.out.println("Account HolderName :"+accountHolderName);
    System.out.println("Account Number: "+accountNumber);
}
 public void withdrawInfo(int withdrawAmount)
 {
    if (withdrawAmount<balance) {
    balance=balance-withdrawAmount;
    System.out.println("Withdra Succesfull:");  
    }
    else{
    System.out.println("Insufficient Funds ");
    }
 } 
 public void deposite(int amount)
 {
    balance=balance+amount;
 }
 public void showBlance()
 {
    System.out.println("Balance is :"+balance);
 }

}
class Bank
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        CustomerInfo c1=new CustomerInfo();
        boolean status=true;
        while (status) {
            System.out.println("*************");
            System.out.println("Welcome To Bank ");
            System.out.println("Please Enter\n1.Deposite\n2.Withdraw\n3.ShowBlance\n4.Exit");
            int choice =sc.nextInt();
            switch (choice) {
                case 1:
                {
                    System.out.println("Enter UserName");
                    String name=sc.next();
                    if (name.equals(c1.accountHolderName)) {
                        System.out.println("***Valid UserName***");

                        System.out.println("Enter AccountNumber");
                        int acNumber=sc.nextInt();

                        if (c1.accountNumber==acNumber) {
                            System.out.println("***Valid AccountNumber***");

                            System.out.println("Enter Amount To Deposit");
                            int amount=sc.nextInt();
                            c1.deposite(amount);
                            System.out.println("Deposite Succesful ");
                            
                        }
                        else{
                            System.out.println("Invalid AccountNumber");
                        }
                    }
                    else{
                        System.out.println("Invalid UserName");
                    }
                }
                break;
                case 2:
                {
                    System.out.println("Enter Amount To Withdraw");
                    int withdrawAmount=sc.nextInt();
                    c1.withdrawInfo(withdrawAmount);
                }
                break;
                case 3:
                {
                    c1.showBlance();
                }
                break;
                case 4:
                {
                    System.out.println("Thanking You Visit Again");
                    status=false;
                    break;
                }
                default:
                {
                    sc.close();
                 System.out.println("Enter Valid Option:");
                }
                break;
            }   
        }
    }
}