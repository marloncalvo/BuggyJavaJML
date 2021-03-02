public class Counterexample {
    public static void main(String[] args) {
        int balance = 5700;
        BankAccount account = new BankAccount(balance);
        assert(account.interestAfterYear() == balance/100);
    }
}
