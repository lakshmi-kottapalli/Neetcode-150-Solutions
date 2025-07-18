//Use two pointers, while loop happens while left pointer < right pointer
//Must check if a < b AND is character is false before ++ or - -
//Character.toLowerCase to adjust for capital/lowercase discrepancies
//Make function isValid(char c) to check if valid char
//Return (a <= ‘A’ && a>= ‘Z’   ||  a <= ‘a’ && a>= ‘z’  ||  a <= ‘0’ && a>= ‘9’ )
class Solution {
    public boolean isPalindrome(String s) {
        int a = 0;
        int b = s.length() - 1;
        while (a < b) {
            while (a < b && isValid(s.charAt(a)) == false) {
                a++;
            }
            while (a < b && isValid(s.charAt(b)) == false) {
                b--;
            }
        if (Character.toLowerCase(s.charAt(a)) != Character.toLowerCase(s.charAt(b))) {
            return false;
        }
            a++;
            b--;
        }
        return true;
    }


    public boolean isValid(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'));
    }
}
