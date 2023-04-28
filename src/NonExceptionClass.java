public class NonExceptionClass {
    public static void main(String[] args) {
        Account account = new Account("John Doe", 500, "1234567890");

        try {
            account.transfer(700); // Simulate transfer with an amount greater than the balance
        } catch (NotEnoughMoneyException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.toString());
        } finally {
            System.out.println("Current account balance: " + account.getBalance());
        }
    }
}
