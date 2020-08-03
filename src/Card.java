import java.util.Arrays;
import java.util.List;

public class Card {
    private Suit suit;
    private Figures figures;

    private List<Figures> createList() {
//próbowałam z petli forache ale program nie kompilował, wiec mam cos takiego, da się to zrobic latwiej?

        Figures twoClubs = new Figures(Suit.CLUBS, "two");
        Figures threeClubs = new Figures(Suit.CLUBS, "three");
        Figures fourClubs = new Figures(Suit.CLUBS, "four");
        Figures fiveClubs = new Figures(Suit.CLUBS, "five");
        Figures sixClubs = new Figures(Suit.CLUBS, "six");
        Figures sevenClubs = new Figures(Suit.CLUBS, "seven");
        Figures eightClubs = new Figures(Suit.CLUBS, "eight");
        Figures nineClubs = new Figures(Suit.CLUBS, "nine");
        Figures tenClubs = new Figures(Suit.CLUBS, "ten");
        Figures jackClubs = new Figures(Suit.CLUBS, "jack");
        Figures queenClubs = new Figures(Suit.CLUBS, "queen");
        Figures kingClubs = new Figures(Suit.CLUBS, "king");
        Figures aceClubs = new Figures(Suit.CLUBS, "ace");

        Figures twoDiamonds = new Figures(Suit.DIAMONDS, "two");
        Figures threeDiamonds = new Figures(Suit.DIAMONDS, "three");
        Figures fourDiamonds = new Figures(Suit.DIAMONDS, "four");
        Figures fiveDiamonds = new Figures(Suit.DIAMONDS, "five");
        Figures sixDiamonds = new Figures(Suit.DIAMONDS, "six");
        Figures sevenDiamonds = new Figures(Suit.DIAMONDS, "seven");
        Figures eightDiamonds = new Figures(Suit.DIAMONDS, "eight");
        Figures nineDiamonds = new Figures(Suit.DIAMONDS, "nine");
        Figures tenDiamonds = new Figures(Suit.DIAMONDS, "ten");
        Figures jackDiamonds = new Figures(Suit.DIAMONDS, "jack");
        Figures queenDiamonds = new Figures(Suit.DIAMONDS, "queen");
        Figures kingDiamonds = new Figures(Suit.DIAMONDS, "king");
        Figures aceDiamonds = new Figures(Suit.DIAMONDS, "ace");

        Figures twoHearts = new Figures(Suit.HEARTS, "two");
        Figures threeHearts = new Figures(Suit.HEARTS, "three");
        Figures fourHearts = new Figures(Suit.HEARTS, "four");
        Figures fiveHearts = new Figures(Suit.HEARTS, "five");
        Figures sixHearts = new Figures(Suit.HEARTS, "six");
        Figures sevenHearts = new Figures(Suit.HEARTS, "seven");
        Figures eightHearts = new Figures(Suit.HEARTS, "eight");
        Figures nineHearts = new Figures(Suit.HEARTS, "nine");
        Figures tenHearts = new Figures(Suit.HEARTS, "ten");
        Figures jackHearts = new Figures(Suit.HEARTS, "jack");
        Figures queenHearts = new Figures(Suit.HEARTS, "queen");
        Figures kingHearts = new Figures(Suit.HEARTS, "king");
        Figures aceHearts = new Figures(Suit.HEARTS, "ace");

        Figures twoSpades = new Figures(Suit.SPADES, "two");
        Figures threeSpades = new Figures(Suit.SPADES, "three");
        Figures fourSpades = new Figures(Suit.SPADES, "four");
        Figures fiveSpades = new Figures(Suit.SPADES, "five");
        Figures sixSpades = new Figures(Suit.SPADES, "six");
        Figures sevenSpades = new Figures(Suit.SPADES, "seven");
        Figures eightSpades = new Figures(Suit.SPADES, "eight");
        Figures nineSpades = new Figures(Suit.SPADES, "nine");
        Figures tenSpades = new Figures(Suit.SPADES, "ten");
        Figures jackSpades = new Figures(Suit.SPADES, "jack");
        Figures queenSpades = new Figures(Suit.SPADES, "queen");
        Figures kingSpades = new Figures(Suit.SPADES, "king");
        Figures aceSpades = new Figures(Suit.SPADES, "ace");

        List<Figures> figuresList = Arrays.asList(twoClubs, threeClubs, fourClubs, fiveClubs, sixClubs,
                sevenClubs, eightClubs, nineClubs, tenClubs, jackClubs, queenClubs, kingClubs, aceClubs,
                twoDiamonds, threeDiamonds, fourDiamonds, fiveDiamonds, sixDiamonds, sevenDiamonds, eightDiamonds,
                nineDiamonds, tenDiamonds, jackDiamonds, queenDiamonds, kingDiamonds, aceDiamonds,
                twoHearts, threeHearts, fourHearts, fiveHearts, sixHearts, sevenHearts, eightHearts,
                nineHearts, tenHearts, jackHearts, queenHearts, kingHearts, aceHearts,
                twoSpades, threeSpades, fourSpades, fiveSpades, sixSpades, sevenSpades, eightSpades,
                nineSpades, tenSpades, jackSpades, queenSpades, kingSpades, aceSpades);

        return figuresList;
    }

    public void showPackOfCards() {
        List<Figures> figures = createList();
        for (Figures f:figures) {
            System.out.println(f);
        }
    }
}
