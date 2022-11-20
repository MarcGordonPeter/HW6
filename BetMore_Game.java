public class BetMore_Game {
    private Shuffle s;

    public int Play() {
        s = new Shuffle();
        return s.pick_card();
    }

    public Player findWinner(Player system, Player Player_2) {
        return system.getCard() > Player_2.getCard() ? system : Player_2;
    }
}
