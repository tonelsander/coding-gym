def find_index_sum_target(nums, target):
    nums_by_index = {}

    for i, num in enumerate(nums):

        complement = target - num # find the other number
        if complement in nums_by_index:  # if complement exists found the other number
            return [nums_by_index[complement], i]

        nums_by_index[num] = i# if the complement do not exists add the number to the map

    return [] # no complement found on the map then there aren't number that sum to target