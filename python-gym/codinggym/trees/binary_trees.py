from typing import List

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


"""
Perform a level-order traversal (also known as breadth-first traversal) of the tree.
Return the values of the nodes in each level as a list of lists.

Time Complexity: O(n), each node is processed exactly once
Space Complexity: O(n), when tree is completely unbalanced, 
    best case O(w) where w is the max widht

Example binary tree:
        3
      //  \\
     9     20
         //  \\
        15    7

root = TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7)))

Output:
[[3], [9, 20], [15, 7]]
"""
def level_order_traversal(root: TreeNode) -> List[List[int]]:
    if not root:
        return []

    result = []
    to_visit = [root]

    while to_visit:
        current_level = []
        next_level = []

        for node in to_visit:
            current_level.append(node)

            if node.left:
                next_level.append(node.left)

            if node.right:
                next_level.append(node.right)

        result.append(current_level)
        to_visit = next_level
    
    return result

    

