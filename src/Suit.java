public enum Suit {
    CLUBS("trefl"),
    DIAMONDS("karo"),
    HEARTS("kier"),
    SPADES("wino");

    private String plTranstation;

    Suit(String plTranstation) {
        this.plTranstation = plTranstation;
    }

    public String getPlTranstation() {
        return plTranstation;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
