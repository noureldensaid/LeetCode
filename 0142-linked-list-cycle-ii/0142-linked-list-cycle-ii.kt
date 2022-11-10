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
 
fun detectCycle(head: ListNode?): ListNode? {
    var start = head
    var fast = head
    var slow = head
    while (fast?.next != null) {
        slow = slow!!.next
        fast = fast.next!!.next
        if (slow == fast) {
            while (start != slow) {
                slow = slow!!.next
                start = start!!.next
            }
            return start
        }
    }
    return null
}



}