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
        deck.getCardList().stream().forEach(System.out::println);
        System.out.println("===============");
        System.out.println("СОРТИРУЕМ КОЛОДУ");
        Collections.sort(deck.getCardList());
        deck.getCardList().stream().forEach(System.out::println);
        System.out.println("===============");
        System.out.println("ПЕРЕМЕШИВАЕМ");
        deck.shuffle();
        deck.getCardList().stream().forEach(System.out::println);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("На скольких раздать");
        int playersCount = Integer.parseInt(reader.readLine());
        List<Player> playerList = new ArrayList<>(playersCount);
        for (int i = 0; i < playersCount; i++) {
            playerList.add(new Player());
        }
        IssuanceСard ic = new IssuanceСard(deck);
        System.out.println("В колоде: "+ic.getSize());
        if ((playersCount*6)>ic.getSize()){
            System.out.println("Не хватит карт!");
        }else {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < playerList.size(); j++) {
                    System.out.println("Раздаем игроку №"+j);
                    playerList.get(j).addCard(ic.reciveCard());
                }
            }
        }
        ic.print();
    }
}
