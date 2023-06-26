import java.util.ArrayList;

public class PlayingGroundDecorator extends PlayingGround{
    public CasinoBankAgent casinoBankAgent = new CasinoBankAgent();
    public PlayingGroundDecorator(Dealer dealer, ArrayList<Player> players) {
        super(dealer, players);
    }

    @Override
    public void play() {
    }


}
