package Stupid;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> cards = new ArrayList<>();
    public void addCard(Card card){
        this.cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }
}
