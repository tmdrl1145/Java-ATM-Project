package atm;
 
import java.util.Scanner;
 
public class atm {
 
    public static void main(String[] args) {
 
        String user_name = "Seung Gi";
        String password = "1233";
        String bank_name = "Simon's Bank";
        double current_balance = 1330;
 
        Scanner atm_scanner = new Scanner(System.in);
        System.out.println("Welcome to " + bank_name +"!");
        
        System.out.println("Please Enter Your PIN Number ");
        String password_entered = atm_scanner.nextLine();
        
        if (password_entered.equals(password)){
            System.out.println("Account Name Holder : " + user_name);
            System.out.println("Please choose the following options ");
            
            System.out.println("1. Show Balance" +
                               "\n2. Depsit Money" +
                               "\n3. Withdraw Amount" +
                               "\n4. Quit");
            int user_choice = atm_scanner.nextInt();
            
            if (user_choice == 1) {
                System.out.println("Your Current Balance is " + current_balance);
            } 
            else if (user_choice == 2) {
                System.out.println("Please Enter The Amount To Deposit ");
                double deposit_amount = atm_scanner.nextDouble();
                
                current_balance += deposit_amount;
                System.out.println("You have successfully deposited " + deposit_amount
                        + " \nNow your balnce is " + current_balance);
            }
            else if (user_choice == 3) {
                System.out.println("Please Enter the Amount to Witdraw");
                double withdraw_amount = atm_scanner.nextDouble();
                
                if (withdraw_amount > current_balance) {
                    System.out.println("Insufficient Balance. Please Try Again");
                } else {
                    current_balance -= withdraw_amount;
                    System.out.println("You have successfully withdraw " + withdraw_amount
                            + " \nNow your balnce is " + current_balance);
                }
            }
            else if (user_choice == 4) {
                System.out.println("Thank you! See you later!");
            }
        }
           
    }       

}