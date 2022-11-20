import java.util.Scanner;

public class Player {
    private String name;
    private int card;

    public Player(String name) {
        this.name = name;
    }

    public int Start(BetMore_Game bet) {
        card = bet.Play();
        return card;
    }

    public int Start(BetMore_Game bet, int max) {
        card = bet.Play();
        max--;
        System.out.println("Zahl: " + card + " JA/NEIN Noch " + max + " versuche");
        Scanner s = new Scanner(System.in);
        String zeile = new String();
        zeile = s.nextLine();
        if (zeile.equals(new String("JA")) || max <= 0) {
            return card;
        } else {
            return Start(bet, max);
        }
    }

    public int getCard() {
        return card;
    }

    public String getName() {
        return name;
    }
}
