public class Game_Chair {
    private BetMore_Game bet;
    private Player computer;
    private Player player2;

    public Game_Chair() {
        computer = new Player("Computer");
        player2 = new Player("Player_2");
        bet = new BetMore_Game();

        computer.Start(bet);
        player2.Start(bet, 5);

        System.out.println(bet.findWinner(computer, player2).getName() + " hat gewonnen! (computer: "
                + computer.getCard() + ": player: " + player2.getCard());
    }
}
