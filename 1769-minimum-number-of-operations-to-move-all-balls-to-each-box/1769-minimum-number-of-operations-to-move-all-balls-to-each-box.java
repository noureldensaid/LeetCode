class Solution {
public int[] minOperations(String boxes) {
    int n = boxes.length();
    int[] answer = new int[n];

    // Calculate the number of operations to move balls to the left of each box
    int count = boxes.charAt(0) - '0';
    int operations = 0;
    for (int i = 1; i < n; i++) {
        operations += count;
        answer[i] = operations;
        count += boxes.charAt(i) - '0';
    }

    // Calculate the number of operations to move balls to the right of each box
    count = boxes.charAt(n - 1) - '0';
    operations = 0;
    for (int i = n - 2; i >= 0; i--) {
        operations += count;
        answer[i] += operations;
        count += boxes.charAt(i) - '0';
    }

    return answer;
}
}

 
