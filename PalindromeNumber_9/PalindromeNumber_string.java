package PalindromeNumber_9;

public class PalindromeNumber_string {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1007001));
    }

    public static boolean isPalindrome(int x) {
        String newNumber = Integer.toString(x);
        int n = newNumber.length();
        for (int i = 0; i < n / 2; i++) {
            if (newNumber.charAt(i) != newNumber.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}