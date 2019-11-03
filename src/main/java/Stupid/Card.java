package Stupid;

public class Card implements Comparable<Card> {
    private int rank;
    private Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int compareTo(Card o) {
        if (o==null) return 1;
        if(this.getSuit().compareTo(o.getSuit())==0){
            return this.getRank()-o.getRank();
        }
        return this.getSuit().compareTo(o.getSuit())>0?1:-1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("карта ");
        if(this.getRank()<=10){
            sb.append(this.getRank()+" ");
        } else if(this.getRank()==11){
            sb.append("валет ");
        } else if(this.getRank()==12){
            sb.append("дама ");
        } else if(this.getRank()==13){
            sb.append("король ");
        } else if(this.getRank()==14){
            sb.append("туз ");
        } else{
            sb.append("ДЖОКЕР ");
        }

        if(this.getSuit()==Suit.CLUBS){
            sb.append("треф");
        }else if(this.getSuit()==Suit.SPADES){
            sb.append("пика");
        }else if(this.getSuit()==Suit.DIAMONDS){
            sb.append("бубна");
        }else if(this.getSuit()==Suit.DIAMONDS){
            sb.append("червей");
        }else{
            sb.append("*");
        }
        return sb.toString();
    }
}
