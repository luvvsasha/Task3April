 public class MainClass {
     public static void main(String[] args) {
         Account account = new Account("Dominik", 500, "24683694856789");

         try {
             account.transfer(700); // Simulate transfer with an amount greater than the balance
         } catch (NotEnoughMoneyException e) {
             System.out.println("Bruhh you're mad broke: " + e.getMessage());
         } catch (Exception e) {
             System.out.println("exception occurred: " + e.toString());
         } finally {
             System.out.println("Your broke self's balance is: " + account.getBalance());
         }
     }
 }