package javanut8.ch04;

public enum Suit {
    HEART('♥'),
    CLUB('♣'),
    DIAMOND('♦'),
    SPADE('♠');

    private final char symbol;
    private final char letter;

    public char getSymbol() {
        return symbol;
    }

    public char getLetter() {
        return letter;
    }

    Suit(char symbol) {
        this.symbol = symbol;
        this.letter = switch (symbol) {
            case '♥' -> 'H';
            case '♣' -> 'C';
            case '♦' -> 'D';
            case '♠' -> 'S';
            default -> throw new RuntimeException("Illegal suit seen: "+ symbol);
        };
    }
}
