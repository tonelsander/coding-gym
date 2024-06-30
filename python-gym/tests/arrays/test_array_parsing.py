def test_find_index_sum_target():
    assert(two_sum([2, 7, 11, 15], 9) == [0,1])  # Output: [0, 1]
    assert(two_sum([3, 2, 4], 6) == [1,2])       # Output: [1, 2]
    assert(two_sum([3, 3], 6) == [0,1])          # Output: [0, 1]