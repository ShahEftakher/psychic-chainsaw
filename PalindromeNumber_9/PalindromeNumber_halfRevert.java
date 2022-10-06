package PalindromeNumber_9;

public class PalindromeNumber_halfRevert {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int revertedNumber = 0;
        int tempX = x;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + tempX % 10;
            tempX = tempX / 10;
        }
        if (x == revertedNumber)
            return true;
        else
            return false;
    }
}