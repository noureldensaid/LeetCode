class Solution {
    fun minOperations(boxes: String): IntArray {
     val n = boxes.length
    val answer = IntArray(n)

    var count = boxes[0] - '0'
    var operations = 0
    for (i in 1 until n) {
        operations += count
        answer[i] = operations
        count += boxes[i] - '0'
    }

    count = boxes[n - 1] - '0'
    operations = 0
    for (i in n - 2 downTo 0) {
        operations += count
        answer[i] += operations
        count += boxes[i] - '0'
    }

    return answer
}

}