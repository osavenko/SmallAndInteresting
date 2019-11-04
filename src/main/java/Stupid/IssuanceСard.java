package Stupid;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class IssuanceСard {
    private Stack<Card> deck;

    public IssuanceСard(Deck deck) {
        this.deck = new Stack<>();
        for (Card card:deck.getCardList()) {
            this.deck.push(card);
        }
    }
    public void print(){
        System.out.println("В колоде "+deck.size()+" карт/карта");
        deck.stream().forEach(System.out::println);
    }
    public Card reciveCard(){
        if(!this.deck.empty()) {
            return this.deck.pop();
        }
        return null;
    }
    public int getSize(){
        return deck.size();
    }
}
