package Stupid;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {
/*
* Тестирование работы конструктора по умолчанию, с парраметром.
* Задача на тестирование:
* 1. Создать колоду карт из 36 карт.
* 1.1 Создать колоду.
* 1.2 Проверить сколько элементов в колоде.
* 1.3 Проверить колоду на null
* 1.4 Проверить на null каждую карту
* 2. Создать колоду карт из 54 карт.
* 2.1 Создать колоду.
* 2.2 Проверить сколько элементов в колоде.
* 2.3 Проверить колоду на null
* 2.4 Проверить на null каждую карту
 * */
    @Test
    public void testCreateDeck1(){
        Deck deck = new Deck(36);
        assertEquals("Создание колоды на 36 карт ->",deck.getCardList().size(), 36);
        for (int i = 0; i < 36; i++) {
            Card card = deck.getCardList().get(i);
            assertNotNull(card);
        }
        deck = new Deck(52);
        assertEquals("Создание колоды на 52 карты ->",deck.getCardList().size(),52);
        for (int i = 0; i < 52; i++) {
            Card card = deck.getCardList().get(i);
            assertNotNull(card);
        }
    }
}