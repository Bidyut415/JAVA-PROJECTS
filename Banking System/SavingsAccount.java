public class SavingsAccount extends Account {

    public SavingsAccount(String name, int accountNumber) {
        super(name, accountNumber);
    }

    @Override
    public void accountType() {
        System.out.println("Account Type: Savings Account");
    }
}

