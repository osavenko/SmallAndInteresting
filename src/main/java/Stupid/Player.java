package Stupid;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> cards = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void addCard(Card card){
        this.cards.add(card);
    }
    public String getName() {
        return name;
    }

    public List<Card> getCards() {
        return cards;
    }
    public void print(){
        System.out.println("Карты игрока: "+this.name);
        cards.stream().forEach(System.out::println);
    }
}
