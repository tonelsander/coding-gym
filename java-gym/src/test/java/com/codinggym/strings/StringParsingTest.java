package com.codinggym.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringParsingTest {

    private StringParsing stringParsing = new StringParsing();

    @Test
    public void parenthesisAreValid(){
        assertTrue(stringParsing.parenthesisAreValid("()"));
        assertTrue(stringParsing.parenthesisAreValid("()[]{}"));
        assertTrue(stringParsing.parenthesisAreValid("([])"));
        assertTrue(stringParsing.parenthesisAreValid("{[]}"));

        assertFalse(stringParsing.parenthesisAreValid("(]"));
        assertFalse(stringParsing.parenthesisAreValid("([)]"));
    }

}