package algorithms.easy;

class Solution {
    public int numUniqueEmails(String[] emails) {
        int result = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            if (set.contains(cleaner(emails[i]))) {
            } else {
                set.add(cleaner(emails[i]));
                result++;
            }
        }
        return result;
    }

    public String cleaner(String email) {
        String result = "";
        int i = 0;
        char ch;
        boolean noPlus = true;
        do {
            ch = email.charAt(i);
            if (!noPlus) {

            } else if (ch == '+') {
                noPlus = false;
            } else if (ch == '.') {
            } else {
                result += ch;
            }
            i++;
        } while (ch != '@');


        for (; i < email.length(); i++) {
            result += email.charAt(i);
        }
        return result;
    }

}
