import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class CardTest {
    public static void main(String[] args) {
        Card card = new Card();
        CardPL cardPL = new CardPL();
        ChooseLanguge languge = new ChooseLanguge();
        languge.choosePLorENG(card, cardPL);
    }
}
