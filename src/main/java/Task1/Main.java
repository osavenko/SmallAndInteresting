package Task1;

public class Main {
    public static void main(String[] args) {
        for (int i = 10; i<100;i++){
            int iPalindrom = i;
            while (iPalindrom<10000){
                iPalindrom = iPalindrom+Integer.parseInt(Palindrome.reverse(iPalindrom));
                Palindrome p = new Palindrome(iPalindrom);
                if(p.isPalindrome()&&iPalindrom>1000){
                    System.out.println(p+"образуется от ->"+i);

                    break;
                }
            }
        }
    }
}
