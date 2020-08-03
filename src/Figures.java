public class Figures {
    private Suit suit;
    private String cardFigures;

    public Figures(Suit suit, String cardFigures) {
        this.suit = suit;
        this.cardFigures = cardFigures;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getCardFigures() {
        return cardFigures;
    }

    @Override
    public String toString() {
        return cardFigures + " of " + suit.toString();
    }
}
