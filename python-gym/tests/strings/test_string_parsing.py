def test_parenthesis_are_valid():
    assert(is_valid("()"))        # Output: True
    assert(is_valid("()[]{}"))    # Output: True
    assert(is_valid("(]") == False)        # Output: False
    assert(is_valid("([)]") == False)      # Output: False
    assert(is_valid("{[]}"))      # Output: True