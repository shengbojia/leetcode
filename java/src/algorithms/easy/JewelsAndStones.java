package algorithms.easy;

class Solution {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            if (containsChar(J, S.charAt(i))) {
                result++;
            }
        }
        return result;
    }

    private boolean containsChar(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }
}
