/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reverseList(head: ListNode?): ListNode? {
    var headNode: ListNode? = head
    var prevNode: ListNode? = null
    while (headNode != null) {
        val next: ListNode? = headNode.next
        headNode.next = prevNode
        prevNode = headNode
        headNode = next
    }
    return prevNode
}


}