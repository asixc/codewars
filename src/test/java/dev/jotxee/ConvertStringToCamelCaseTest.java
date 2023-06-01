package dev.jotxee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ConvertStringToCamelCaseTest {


    @Test
    void testSomeUnderscoreLowerStart() {
        final String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
    }
    @Test
    void testSomeDashLowerStart() {
        final String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
    }

    @Test
    void testshouldWorkWithRandomValues() {
        final String input = "desert-side-Black";
        System.out.println("input: "+input);
        assertEquals("desertSideBlack", ConvertStringToCamelCase.toCamelCase(input));
    }



}