import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;

public class Bank implements BankingSystem{
    public Map<Player, Double> accountHolders = new HashMap<Player,Double>();
    private Bank(){

    }
    public static Bank createBank(){
        return new Bank();
    }




    public void deposit(Player accountHolder ,double sum ){
        if (!this.accountHolders.containsKey(accountHolder)){
            this.accountHolders.put(accountHolder ,sum );
        }
        else {
            this.accountHolders.put(accountHolder,accountHolders.get(accountHolder)+sum);
        }


     }

    public void withdraw( Player accountHolder ,  double sum){
        this.accountHolders.put(accountHolder,accountHolders.get(accountHolder)-sum);
    }

    public boolean hasEnoughBalance(Player player , double balanceToCheck){
        if(this.accountHolders.containsKey(player)) {
            return this.accountHolders.get(player) >= balanceToCheck;
        }
        return false;
    }



}
