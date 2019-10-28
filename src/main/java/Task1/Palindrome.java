package Task1;

public class Palindrome {
    private int value;

    public boolean isPalindrome(){
        if (Integer.toString(value).equals(reverse())){
            return true;
        }
        return false;
    }
    private String reverse(){
        return Palindrome.reverse(this.value);
    }
    public static String reverse(int number){
        StringBuilder sb = new StringBuilder(Integer.toString(number));
        return sb.reverse().toString();
    }
    public Palindrome() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Palindrome(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (isPalindrome()) return "Ура!!! Это "+value + " палиндром :-)";
        return "Число "+value + "не палиндром :-(";
    }
}
