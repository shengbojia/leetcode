package algorithms.easy;

class Solution {
    public int romanToInt(String s) {

        if (s.isEmpty()) {
            return 0;
        }

        if (s.length() == 1) {
            return valueOf(s.charAt(0));
        }

        int result = 0;
        char ch = s.charAt(0);
        char nextCh = s.charAt(1);

        if (subtractionInstance(ch, nextCh)) {
            result -= valueOf(ch);
            result += valueOf(nextCh);
            result += romanToInt(s.substring(2));
        } else {
            result += valueOf(ch);
            result += romanToInt(s.substring(1));
        }

        return result;
    }

    private boolean subtractionInstance(char firstNum, char secondNum) {
        if (firstNum == 'V' || firstNum == 'L' || firstNum == 'D' || firstNum == 'M') {
            return false;
        } else if (firstNum == 'I' && !(secondNum == 'V' || secondNum == 'X')) {
            return false;
        } else if (firstNum == 'X' && !(secondNum == 'L' || secondNum == 'C')) {
            return false;
        } else if (firstNum == 'C' && !(secondNum == 'D' || secondNum == 'M')) {
            return false;
        } else {
            return true;
        }
    }

    private int valueOf(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new ArithmeticException();
        }
    }


}
