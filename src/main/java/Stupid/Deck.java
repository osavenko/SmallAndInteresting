package Stupid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cardList;
    private int maxCards;

    public List<Card> getCardList() {
        return cardList;
    }

    private Deck() {

    }

    public Deck(int maxCards) {
        this.maxCards = maxCards;
        init();
    }
    private void init(){
        cardList = new ArrayList(maxCards);

        for (int i = 0; i < maxCards/4; i++) {
            cardList.add(new Card(i+6,Suit.CLUBS));
            cardList.add(new Card(i+6,Suit.SPADES));
            cardList.add(new Card(i+6,Suit.DIAMONDS));
            cardList.add(new Card(i+6,Suit.HEARTS));
        }
    }
    public void shuffle(){
        Collections.shuffle(cardList);
    }
    public void print(){

        this.getCardList().stream().forEach(System.out::println);
    }
}
