package Stupid;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class IssuanceСard {
    private Stack<Card> deck;
    private int players;

    public IssuanceСard(Deck deck, int players) {
        this.deck = new Stack<>();
        for (Card card:deck.getCardList()) {
            this.deck.push(card);
        }
        this.players = players;
    }
    public void print(){
        System.out.println("Колода раздается на "+this.players+" ");
        System.out.println("В колоде "+deck.size()+" карт/карта");
    }
    public Card reciveCard(){
        if(this.deck.size()>0) {
            return this.deck.pop();
        }
        return null;
    }
}
