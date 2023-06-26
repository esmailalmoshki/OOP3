import java.util.ArrayList;

public class UsualPlayingGround extends PlayingGroundDecorator {
    @Override
    public void play() {

    }

    public UsualPlayingGround(Dealer dealer, ArrayList<Player> players) {
        super(dealer,players);
    }


}
