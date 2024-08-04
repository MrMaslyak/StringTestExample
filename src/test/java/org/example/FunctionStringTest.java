package org.example;

import static org.junit.Assert.*;

public class FunctionStringTest {

    @org.junit.Test
    public void printLength() {
        assertEquals(2,  FunctionString.printLength("Hello World"));
        assertEquals(0,  FunctionString.printLength("   "));
        assertEquals(0,     FunctionString.printLength(""));
        assertEquals(2,  FunctionString.printLength("Hello   World"));
        assertEquals(2,  FunctionString.printLength(" Hello World "));
        assertEquals(2,        FunctionString.printLength("Hello World   "));
        assertEquals(2,   FunctionString.printLength("   Hello World"));
        assertEquals(5, FunctionString.printLength("   Hello World hello word hi  "));
    }

    @org.junit.Test
    public void reverseMethod() {
        assertEquals("dlroW olleH", FunctionString.reverseMethod("Hello World"));
        assertEquals("0", FunctionString.reverseMethod("   "));
        assertEquals("0", FunctionString.reverseMethod(""));
        assertEquals("dlroW   olleH", FunctionString.reverseMethod("Hello   World"));
        assertEquals("dlroW olleH   ", FunctionString.reverseMethod("   Hello World"));
        assertEquals("   dlroW olleH   ", FunctionString.reverseMethod("   Hello World   "));
        assertEquals("   dlrow olleh", FunctionString.reverseMethod("hello world   "));
        assertEquals("dlrow olleh   ", FunctionString.reverseMethod("   hello world"));
        assertEquals("   dlrow olleh   ", FunctionString.reverseMethod("   hello world   "));
    }

    @org.junit.Test
    public void checkVowelsElements() {
        assertEquals(3, FunctionString.checkVowelsElements("Hello World"));
        assertEquals(0, FunctionString.checkVowelsElements("rty"));
        assertEquals(0, FunctionString.checkVowelsElements(""));
        assertEquals(3, FunctionString.checkVowelsElements("Hello   World"));
        assertEquals(3, FunctionString.checkVowelsElements(" Hello World "));
        assertEquals(3, FunctionString.checkVowelsElements("Hello World   "));
        assertEquals(3, FunctionString.checkVowelsElements("   Hello World"));
        assertEquals(7, FunctionString.checkVowelsElements("   Hello World hello word hi  "));
    }

    @org.junit.Test
    public void printPolindrom() {
        assertEquals("1", FunctionString.printPolindrom("aba"));
        assertEquals("0", FunctionString.printPolindrom("   "));
        assertEquals("0", FunctionString.printPolindrom(""));
        assertEquals("0", FunctionString.printPolindrom("Hello   World"));
        assertEquals("0", FunctionString.printPolindrom(" Hello World "));
        assertEquals("0", FunctionString.printPolindrom("Hello World   "));
        assertEquals("0", FunctionString.printPolindrom("   Hello World"));
        assertEquals("0", FunctionString.printPolindrom("   Hello World hello word hi  "));
        assertEquals("0", FunctionString.printPolindrom("hello"));
        assertEquals("1", FunctionString.printPolindrom("racecar"));
        assertEquals("1", FunctionString.printPolindrom("level"));

    }

    @org.junit.Test
    public void removeDuplicateCharacters() {
        assertEquals("Helo Wrd", FunctionString.removeDuplicateCharacters("Hello World"));
        assertEquals("0", FunctionString.removeDuplicateCharacters("   "));
        assertEquals("0", FunctionString.removeDuplicateCharacters(""));
        assertEquals("Helo Wrd", FunctionString.removeDuplicateCharacters("Hello   World"));
        assertEquals(" HeloWrd", FunctionString.removeDuplicateCharacters(" Hello World "));
        assertEquals("Helo Wrd", FunctionString.removeDuplicateCharacters("Hello World   "));
        assertEquals(" HeloWrd", FunctionString.removeDuplicateCharacters("   Hello World"));
        assertEquals(" HeloWrd", FunctionString.removeDuplicateCharacters("   Hello World   "));
        assertEquals(" HeloWrdhwi", FunctionString.removeDuplicateCharacters("   Hello World hello word hi  "));
    }

    @org.junit.Test
    public void changeArrive() {
        assertArrayEquals(new String[]{"Hello", "World"}, FunctionString.changeArrive("Hello World"));
        assertArrayEquals(new String[]{"0"}, FunctionString.changeArrive("   "));
        assertArrayEquals(new String[]{"0"}, FunctionString.changeArrive(""));
        assertArrayEquals(new String[]{"Hello", "", "", "World"}, FunctionString.changeArrive("Hello   World"));
        assertArrayEquals(new String[]{"", "Hello", "World"}, FunctionString.changeArrive(" Hello World "));
        assertArrayEquals(new String[]{"Hello", "World"}, FunctionString.changeArrive("Hello World   "));
        assertArrayEquals(new String[]{"", "", "", "Hello", "World"}, FunctionString.changeArrive("   Hello World"));
        assertArrayEquals(new String[]{"", "", "", "Hello", "World"}, FunctionString.changeArrive("   Hello World   "));
        assertArrayEquals(new String[]{"", "", "", "Hello", "World", "hello", "word", "hi"}, FunctionString.changeArrive("   Hello World hello word hi  "));
    }

    @org.junit.Test
    public void reverseString() {
        assertEquals("dlroW olleH", FunctionString.reverseString("Hello World"));
        assertEquals("0", FunctionString.reverseString("   "));
        assertEquals("0", FunctionString.reverseString(""));
        assertEquals("dlroW   olleH", FunctionString.reverseString("Hello   World"));
        assertEquals("dlroW olleH   ", FunctionString.reverseString("   Hello World"));
        assertEquals("   dlroW olleH   ", FunctionString.reverseString("   Hello World   "));
        assertEquals("   dlrow olleh", FunctionString.reverseString("hello world   "));
        assertEquals("dlrow olleh   ", FunctionString.reverseString("   hello world"));
        assertEquals("   dlrow olleh   ", FunctionString.reverseString("   hello world   "));
    }

    @org.junit.Test
    public void capitalizeFirstLetter() {
        assertArrayEquals(new String[]{"Hello", "World"}, FunctionString.capitalizeFirstLetter("hello world"));
        assertArrayEquals(new String[]{"0"}, FunctionString.capitalizeFirstLetter("   "));
        assertArrayEquals(new String[]{"0"}, FunctionString.capitalizeFirstLetter(" "));
        assertArrayEquals(new String[]{"Hello", "", "", "World"}, FunctionString.capitalizeFirstLetter("hello   world"));
    }

    @org.junit.Test
    public void areAnagrams() {
        assertTrue(FunctionString.areAnagrams("listen", "silent"));
        assertFalse(FunctionString.areAnagrams("hello", "world"));
        assertFalse(FunctionString.areAnagrams("abc", "def"));
        assertFalse(FunctionString.areAnagrams("aabbcc", "aabbc"));
        assertTrue(FunctionString.areAnagrams("обезьянство", "светобоязнь"));
        assertTrue(FunctionString.areAnagrams("обезьянство", "обезьянство"));
        assertFalse(FunctionString.areAnagrams("обезьянство", "обезьянств"));
    }
}