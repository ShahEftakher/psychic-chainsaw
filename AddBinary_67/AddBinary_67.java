public class AddBinary_67 {
    public static void main(String[] args) {
        System.out.println(addBinary("10100", "10100"));
    }

    public static String addBinary(String a, String b) {
        int i = 0;
        String result = "";
        char carry = '0';
        while (i < a.length() || i < b.length()) {
            // System.out.println(a.length());
            // System.out.println(b.length());
            // System.out.println(i);
            if (a.charAt(i) == '1' && b.charAt(i) == '1' && carry == '1') {
                result = '1' + result;
                carry = '1';
            } else if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                result = '0' + result;
                carry = '1';
            } else if (a.charAt(i) == '0' && b.charAt(i) == '0' && carry == '1') {
                result = '1' + result;
            } else if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                result = '0' + result;
            }
            i++;
        }
        if (carry == '1') {
            result = '1' + result;
        }
        return result;
    }
}