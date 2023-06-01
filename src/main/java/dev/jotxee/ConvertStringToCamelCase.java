package dev.jotxee;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertStringToCamelCase {
    /*
    Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

    Examples
    "the-stealth-warrior" gets converted to "theStealthWarrior"

    "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

    "The_Stealth-Warrior" gets converted to "TheStealthWarrior"

     */
    static String toCamelCase(String string) {
        /*
        return Arrays.stream(string
                    .replace("-", " ")
                    .replace("_", " ")
                    .split(" ")
                ).map( word-> {
                         System.out.println(word);
                        final String firstLetter = word.trim().substring(0,1);
                        return firstLetter.toUpperCase() + word.substring(1);
                }).collect(Collectors.joining()).toString();
         */
        final String[] words = string.split("[-_]");
        final StringBuilder phraseFinal = new StringBuilder( words[0]);
        for (int i = 1; i < words.length; i++) {
            final String firstLetter = words[i].trim().substring(0,1).toUpperCase();
            phraseFinal.append(firstLetter + words[i].substring(1));
        }
        return phraseFinal.toString();
    }

    static String toCamelCaseBetterSolution1(String str){
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }

    static String toCamelCaseBetterSolution2(String s){
        Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(1).toUpperCase());
        }
        return m.appendTail(sb).toString();
    }
}
