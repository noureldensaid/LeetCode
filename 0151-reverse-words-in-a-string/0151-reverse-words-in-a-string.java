class Solution {
     public String reverseWords(String s) {
        char[] text = s.trim().toCharArray();
        String result = "";
        int i = 0;
         String sub ="";
         int n = text.length;
        while (i < n) {
            while (i < n && text[i] == ' ') {
                i++;
            }
            int j = i;
            while (j < n && text[j] != ' ') {
                j++;
            }
            if (result.isEmpty()) {
              sub = String.valueOf(text).substring(i, j);
                result = sub;
            } else {
              sub = String.valueOf(text).substring(i, j);
                result = sub + " " + result;
            }
            i = j+1;
        }
        return result;
    }


}


//      public String reverseWords(String s) {
//     char[] text = s.trim().toCharArray();
//     String result = "";
//     int i = 0;
//     int n = text.length;
//     while (i < n) {
//         while (i < n && text[i] == ' ') {
//             i++;
//         }
//         int j = i;
//         while (j < n && text[j] != ' ') {
//             j++;
//         }
//         if (result.isEmpty()) {
//             String sub = String.valueOf(text).substring(i, j);
//             result = sub;
//         } else {
//             String sub = String.valueOf(text).substring(i, j);
//             result = sub + " " +result;
//         }
//         i = j + 1;
//     }
//     return result;
// }