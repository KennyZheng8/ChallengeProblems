public class reverseString {

    public static void main(String[] args) {

        String str = "abc";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String string) {

        String newString = "";
        int position = string.length() - 1;
        while (position >= 0) {
            newString += string.charAt(position);
            position --;
        }
        return newString;
    }
}
