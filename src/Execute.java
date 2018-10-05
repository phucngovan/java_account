import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("nhập id:");
//        int id=sc.nextInt();
//        System.out.println("nhập số tiền :");
//        double balance=sc.nextDouble();
//        System.out.println("nhập số tiền gửi thêm:");
//        double monney=sc.nextDouble();
//        System.out.println("lãi suất:");
//        double annualInterestRate=sc.nextDouble();

        Account account=new Account(1122,20000,4.5);
        account.setWithdraw(2500);
        account.setDeposit(3000);
        System.out.println("tk la "+account.getBalance());
        System.out.println("lãi " + account.getMonthlyInterest());
        System.out.println(account.getDateCreated());
    }
}
