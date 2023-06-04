class Solution {
public int[] minOperations(String boxes) {
    int n = boxes.length();
    int[] answer = new int[n];
    int operations = 0;
    int count = 0;
 
    // Calculate the number of operations to move balls to the left of each box
    for (int i = 0; i < n; i++) {
        answer[i] += operations;
        count += boxes.charAt(i) - '0';
        operations += count;
    }

    // Calculate the number of operations to move balls to the right of each box
    operations = 0; count = 0;
     for (int i = n-1 ; i > -1; i--) {
       answer[i] += operations;
        count += boxes.charAt(i) - '0';
        operations += count;
    }

    return answer;
}
}

 
