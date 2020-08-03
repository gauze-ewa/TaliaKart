import java.util.Scanner;

public class ChooseLanguge {
    private Card card;
    private CardPL cardPL;

    public void choosePLorENG(Card card, CardPL cardPL) {
        String choice = "";
        Scanner sc = new Scanner(System.in);

        while (!(choice.equalsIgnoreCase("NO"))) {
            System.out.println("Choose language/Wybierz jezyk :");
            System.out.println("ENG/PL");

            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("Pl")) {
                cardPL.showPackOfCards();
                choice="NO";
            }
            else if (answer.equalsIgnoreCase("ENG")) {
                card.showPackOfCards();
                choice="NO";
            }
            else
            {   System.out.println("Does not recognize language/ Nie rozpoznano jezyka");
            System.out.println("Try again/ Spróbój znowu");
            }
        }
        System.out.println("Goodbye/Do widzenia");
        sc.close();
    }
}
