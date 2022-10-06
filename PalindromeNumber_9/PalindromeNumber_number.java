package PalindromeNumber_9;

public class PalindromeNumber_number {
    public static void main(String[] args) {
        System.out.println(isPalindrome(122222231));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int newNumber = 0;
        int tempX = x;
        while (tempX != 0) {
            newNumber = newNumber * 10 + tempX % 10;
            tempX = tempX / 10;
        }
        if (x == newNumber)
            return true;
        else
            return false;
    }
}