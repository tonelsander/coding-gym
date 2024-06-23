package com.codinggym.strings;

import java.util.*;

public class StringParsing {

    /*
        Input: a string containing just the characters '(', ')', '{', '}', '[' and ']'

        An input string is valid if:
        - Open brackets must be closed by the same type of brackets.
        - Open brackets must be closed in the correct order.
        - An empty string is also considered valid
     */
    boolean parenthesisAreValid(String s) {

        Map<Character, Character> closingOpeningBracket = Map.ofEntries(
                Map.entry('}', '{'),
                Map.entry(']', '['),
                Map.entry(')', '(')
        );

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (closingOpeningBracket.containsKey(c)) {
                char openingBracket = closingOpeningBracket.get(c);
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
