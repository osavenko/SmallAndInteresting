package Stupid;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    private Card card;
    @Before
    public void startTest(){
        card = new Card(6, Suit.HEARTS);
    }
    @After
    public void endTest(){
        card = null;
    }
    @Test
    public void test1(){
        assertNotNull(card);
    }


}