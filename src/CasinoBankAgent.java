public class CasinoBankAgent implements BankingSystem{

    private final Bank bank = Bank.createBank();

    @Override
    public void deposit(Player player, double sum) {
        bank.deposit(player,sum);

    }

    @Override
    public void withdraw(Player player, double sum) {
        bank.withdraw(player,sum);
    }

    @Override
    public boolean hasEnoughBalance(Player player, double sum) {
        return bank.hasEnoughBalance(player,sum);
    }

}
