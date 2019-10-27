import Stupid.Card;
import Stupid.Deck;
import Stupid.IssuanceСard;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck(36);
        System.out.println("===============");
        System.out.println("НОВАЯ КОЛОДА");
        deck.getCardList().stream().forEach(System.out::println);
        System.out.println("===============");
        System.out.println("СОРТИРУЕМ КОЛОДУ");
        Collections.sort(deck.getCardList());
        deck.getCardList().stream().forEach(System.out::println);
        System.out.println("===============");
        System.out.println("ПЕРЕМЕШИВАЕМ");
        deck.shuffle();
        deck.getCardList().stream().forEach(System.out::println);

        IssuanceСard ic = new IssuanceСard(deck, 4);
        ic.print();
        Card card = ic.reciveCard();
        ic.print();

    }
}
