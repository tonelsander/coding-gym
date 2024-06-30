"""
Input: a string containing just the characters '(', ')', '{', '}', '[' and ']'

An input string is valid if:
    - Open brackets must be closed by the same type of brackets.
    - Open brackets must be closed in the correct order.
    - An empty string is also considered valid
"""
def parenthesis_are_valid(s):
    
    closing_opening_brackets = {'}': '{', ']': '[', ')': '('}
    stack = []

    for c in s:
        if c in closing_opening_brackets:
            previous_braket = stack.pop()
            opening_bracket = closing_opening_brackets[c]
            if previous_braket != opening_bracket:
                return false
        else:
            stack.append(c)
    
    return not stack
