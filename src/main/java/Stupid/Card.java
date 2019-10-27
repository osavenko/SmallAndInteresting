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
        switch(this.getRank()){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                sb.append(this.getRank()+" ");
                break;
            case 11:
                sb.append("валет ");
                break;
            case 12:
                sb.append("дама ");
                break;
            case 13:
                sb.append("король ");
                break;
            case 14:
                sb.append("туз ");
                break;
            default:
                    sb.append("джокер ");
        }
        switch (this.getSuit()){
            case CLUBS:
                sb.append("треф");
                break;
            case SPADES:
                sb.append("пика");
                break;
            case DIAMONDS:
                sb.append("бубна");
                break;
            case HEARTS:
                sb.append("червей");
                break;
            default:
                sb.append("*");
        }
        return sb.toString();
    }
}
