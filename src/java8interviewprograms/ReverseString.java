package java8interviewprograms;

public class ReverseString {

    public static void main(String[] args) {
        String input = "My Name is Sai Mohan";
        String output = reverseWords(input);
        System.out.println(output);
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            reversed.append(reverseString(word)).append(" ");
        }
        return reversed.toString().trim();
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            char temp = chars[start];
            chars[start] = swapCase(chars[end]);
            chars[end] = swapCase(temp);
            start++;
            end--;
        }
        return new String(chars);
    }

    public static char swapCase(char c) {
        if (Character.isUpperCase(c)) {
            return Character.toLowerCase(c);
        } else if (Character.isLowerCase(c)) {
            return Character.toUpperCase(c);
        }
        return c;
    }
}

