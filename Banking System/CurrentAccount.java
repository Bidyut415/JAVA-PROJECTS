public class CurrentAccount extends Account {

    public CurrentAccount(String name, int accountNumber) {
        super(name, accountNumber);
    }

    @Override
    public void accountType() {
        System.out.println("Account Type: Current Account");
    }
}
