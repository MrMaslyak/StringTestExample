package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        FunctionString.printLength("Hello World it`s Java");
        System.out.println(FunctionString.reverseMethod("hello world   "));
        int vowelsCount = FunctionString.checkVowelsElements("hello world");
        System.out.println("Кількість голосних літер: " + vowelsCount);
        FunctionString.printPolindrom("aba");
        System.out.println(FunctionString.removeDuplicateCharacters(" Hello World "));
        FunctionString.changeArrive("hello arrive i live");
        System.out.println(FunctionString.reverseString("I arrive and I back"));
        FunctionString.capitalizeFirstLetter("hello world it`s all letter upper");
        System.out.println(FunctionString.areAnagrams("обезьянство", "светобоязнь"));
    }



}