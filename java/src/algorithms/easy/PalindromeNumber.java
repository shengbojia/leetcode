package algorithms.easy

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        }

        if (x % 10 == 0) {
            return false;
        }

        int partialOriginal = x;
        int partialReverse = 0;


        while (partialOriginal != 0) {
            partialReverse = 10 * partialReverse + partialOriginal % 10;
            partialOriginal /= 10;
        }
        

        if (x == partialReverse) {
            return true;
        }
        return false;
    }
}
