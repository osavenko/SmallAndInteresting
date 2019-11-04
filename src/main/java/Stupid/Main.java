package Stupid;

import Stupid.Card;
import Stupid.Deck;
import Stupid.IssuanceСard;
import Stupid.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Deck deck = new Deck(36);
        System.out.println("===============");
        System.out.println("НОВАЯ КОЛОДА");
        deck.print();
        System.out.println("===============");
        System.out.println("СОРТИРУЕМ КОЛОДУ");
        Collections.sort(deck.getCardList());
        deck.print();
        System.out.println("===============");
        System.out.println("ПЕРЕМЕШИВАЕМ");
        deck.shuffle();
        deck.print();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("На скольких раздать");
        int playersCount = Integer.parseInt(reader.readLine());
        List<Player> players = new ArrayList<>(playersCount);
        for (int i = 0; i < playersCount; i++) {
            players.add(new Player("Игрок №"+i));
        }
        IssuanceСard ic = new IssuanceСard(deck);
        System.out.println("В колоде: "+ic.getSize());
        if ((playersCount*6)>ic.getSize()){
            System.out.println("Не хватит карт!");
        }else {
            for (int i=0;i<6;i++){
                for (int j = 0; j < players.size(); j++) {
                    players.get(j).addCard(ic.reciveCard());
                }
            }
        }
        for (Player p:players) {
            p.print();
        }
        ic.print();
    }
}
