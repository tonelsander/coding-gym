package com.codinggym.strings;

import java.util.*;

public class StringParsing {

    /*
        Input: a string containing just the characters '(', ')', '{', '}', '[' and ']'

        An input string is valid if:
        - Open brackets must be closed by the same type of brackets
        - Open brackets must be closed in the correct order
        - An empty string is also considered valid

        Time complexity: O(n), iterate through the string once
     */
    boolean parenthesisAreValid(String s) {

        Map<Character, Character> openingByClosingBracket = Map.ofEntries(
                Map.entry('}', '{'),
                Map.entry(']', '['),
                Map.entry(')', '(')
        );

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (openingByClosingBracket.containsKey(c)) {
                char openingBracket = openingByClosingBracket.get(c);
                char previousBracket = stack.pop();
                if (openingBracket != previousBracket) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }

}
