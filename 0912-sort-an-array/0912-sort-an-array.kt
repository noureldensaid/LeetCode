class Solution {
    fun sortArray(array: IntArray): IntArray {
         for (i in 1 until array.size) {
        val current = array[i]
        var j = i - 1
        while (j >= 0 && array[j] > current) {
            array[j + 1] = array[j]
            j--
        }
        array[j + 1] = current
    }
             return array

}
}