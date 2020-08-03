import java.util.Arrays;
import java.util.List;
public class CardPL {

    private Suit suit;
    private FiguresPL figures;

    private List<FiguresPL> createList() {
//próbowałam z petli forache ale program nie kompilował, wiec mam cos takiego, da się to zrobic latwiej?

        FiguresPL threeClubs = new FiguresPL(Suit.CLUBS, "trójka");
        FiguresPL twoClubs = new FiguresPL(Suit.CLUBS, "dwójka");
        FiguresPL fourClubs = new FiguresPL(Suit.CLUBS, "czwórka");
        FiguresPL fiveClubs = new FiguresPL(Suit.CLUBS, "piątka");
        FiguresPL sixClubs = new FiguresPL(Suit.CLUBS, "szóstka");
        FiguresPL sevenClubs = new FiguresPL(Suit.CLUBS, "siódemka");
        FiguresPL eightClubs = new FiguresPL(Suit.CLUBS, "ósemka");
        FiguresPL nineClubs = new FiguresPL(Suit.CLUBS, "dziewiątka");
        FiguresPL tenClubs = new FiguresPL(Suit.CLUBS, "dziesiątka");
        FiguresPL jackClubs = new FiguresPL(Suit.CLUBS, "walec");
        FiguresPL queenClubs = new FiguresPL(Suit.CLUBS, "królowa");
        FiguresPL kingClubs = new FiguresPL(Suit.CLUBS, "król");
        FiguresPL aceClubs = new FiguresPL(Suit.CLUBS, "as");

        FiguresPL twoDiamonds = new FiguresPL(Suit.DIAMONDS, "dwójka");
        FiguresPL threeDiamonds = new FiguresPL(Suit.DIAMONDS, "trójka");
        FiguresPL fourDiamonds = new FiguresPL(Suit.DIAMONDS, "czwórka");
        FiguresPL fiveDiamonds = new FiguresPL(Suit.DIAMONDS, "piątka");
        FiguresPL sixDiamonds = new FiguresPL(Suit.DIAMONDS, "szóstka");
        FiguresPL sevenDiamonds = new FiguresPL(Suit.DIAMONDS, "siódemka");
        FiguresPL eightDiamonds = new FiguresPL(Suit.DIAMONDS, "ósemka");
        FiguresPL nineDiamonds = new FiguresPL(Suit.DIAMONDS, "dziewiątka");
        FiguresPL tenDiamonds = new FiguresPL(Suit.DIAMONDS, "dziesiątka");
        FiguresPL jackDiamonds = new FiguresPL(Suit.DIAMONDS, "walec");
        FiguresPL queenDiamonds = new FiguresPL(Suit.DIAMONDS, "królowa");
        FiguresPL kingDiamonds = new FiguresPL(Suit.DIAMONDS, "król");
        FiguresPL aceDiamonds = new FiguresPL(Suit.DIAMONDS, "as");

        FiguresPL twoHearts = new FiguresPL(Suit.HEARTS, "dwójka");
        FiguresPL threeHearts = new FiguresPL(Suit.HEARTS, "trójka");
        FiguresPL fourHearts = new FiguresPL(Suit.HEARTS, "czwórka");
        FiguresPL fiveHearts = new FiguresPL(Suit.HEARTS, "piątka");
        FiguresPL sixHearts = new FiguresPL(Suit.HEARTS, "szóstka");
        FiguresPL sevenHearts = new FiguresPL(Suit.HEARTS, "siódemka");
        FiguresPL eightHearts = new FiguresPL(Suit.HEARTS, "ósemka");
        FiguresPL nineHearts = new FiguresPL(Suit.HEARTS, "dziewiątka");
        FiguresPL tenHearts = new FiguresPL(Suit.HEARTS, "dziesiątka");
        FiguresPL jackHearts = new FiguresPL(Suit.HEARTS, "walec");
        FiguresPL queenHearts = new FiguresPL(Suit.HEARTS, "królowa");
        FiguresPL kingHearts = new FiguresPL(Suit.HEARTS, "król");
        FiguresPL aceHearts = new FiguresPL(Suit.HEARTS, "as");

        FiguresPL twoSpades = new FiguresPL(Suit.SPADES, "dwójka");
        FiguresPL threeSpades = new FiguresPL(Suit.SPADES, "trójka");
        FiguresPL fourSpades = new FiguresPL(Suit.SPADES, "czwórka");
        FiguresPL fiveSpades = new FiguresPL(Suit.SPADES, "piątka");
        FiguresPL sixSpades = new FiguresPL(Suit.SPADES, "szóstka");
        FiguresPL sevenSpades = new FiguresPL(Suit.SPADES, "siódemka");
        FiguresPL eightSpades = new FiguresPL(Suit.SPADES, "ósemka");
        FiguresPL nineSpades = new FiguresPL(Suit.SPADES, "dziewiątka");
        FiguresPL tenSpades = new FiguresPL(Suit.SPADES, "dziesiątka");
        FiguresPL jackSpades = new FiguresPL(Suit.SPADES, "walec");
        FiguresPL queenSpades = new FiguresPL(Suit.SPADES, "królowa");
        FiguresPL kingSpades = new FiguresPL(Suit.SPADES, "król");
        FiguresPL aceSpades = new FiguresPL(Suit.SPADES, "as");

        List<FiguresPL> figuresList = Arrays.asList(twoClubs, threeClubs, fourClubs, fiveClubs, sixClubs,
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
        List<FiguresPL> figures = createList();
        for (FiguresPL f:figures) {
            System.out.println(f);
        }
    }
}
