package algorithms.easy;

class Solution {
    public String toLowerCase(String str) {
        String lowerCaseStr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                lowerCaseStr += Character.toLowerCase(ch);
            } else {
                lowerCaseStr += ch;
            }
        }
        return lowerCaseStr;

    }
}
