import Stupid.Deck;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck(36);
        deck.getCardList().stream().forEach(System.out::println);
        Collections.sort(deck.getCardList());
        deck.getCardList().stream().forEach(System.out::println);
    }
}
