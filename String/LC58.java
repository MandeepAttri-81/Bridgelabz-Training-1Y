package String;
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();              // remove leading/trailing spaces
        String[] arr = s.split(" ");
        String lastword = arr[arr.length - 1];
        return lastword.length();
    }
}

public class LC58 {
}
