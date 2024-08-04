package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class FunctionString {

    public static int printLength(String words) {
        if (words.trim().isEmpty()) {
            System.out.println(0);
            return 0;
        }
        System.out.println(words.trim().split(" ").length);
        return words.trim().split("\\s+").length;
    }
    public static String reverseMethod(String words) {
        if (words.trim().isEmpty()) return "0";
        return new StringBuilder(words).reverse().toString();
    }

    public static int checkVowelsElements(String words) {
        String lowerCaseWords = words.toLowerCase();
        int count = 0;
        for (int i = 0; i < lowerCaseWords.length(); i++) {
            char ch = lowerCaseWords.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static String printPolindrom(String words) {
        if (words.trim().isEmpty()) {
            return "0";
        }
        boolean isPalindrome = words.trim().equals(reverseMethod(words.trim()));
        System.out.println(words.trim().equals(reverseMethod(words)));
        return isPalindrome ? "1" : "0";
    }

    public static String removeDuplicateCharacters(String words) {
        if (words.trim().isEmpty()) {
            return "0";
        }

        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : words.toCharArray()) {
            if (!set.contains(c)) {
                result.append(c);
                set.add(c);
            }
        }

        return result.toString();
    }

    public static String[] changeArrive(String words) {
        String[] change = words.split(" ");
        System.out.println(Arrays.toString(change));
        if (words.trim().isEmpty()) {
            return new String[]{"0"};
        }
        return words.split(" ");
    }

    public static String reverseString(String words) {
        if (words.trim().isEmpty()) return "0";
        return new StringBuilder(words).reverse().toString();
    }

    public static String[] capitalizeFirstLetter(String words) {
        if (words.trim().isEmpty()) {
            return new String[]{"0"};
        }

        String[] change = words.split(" ");
        for (int i = 0; i < change.length; i++) {
            if (!change[i].isEmpty()) {
                change[i] = change[i].substring(0, 1).toUpperCase() + change[i].substring(1);
            }
        }

        return change;
    }

    public static boolean areAnagrams(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}
