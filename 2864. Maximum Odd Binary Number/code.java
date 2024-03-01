public class Solution {
    public String maximumOddBinaryNumber(String s) {
        int countOnes = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                countOnes++;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("1".repeat(Math.max(0, countOnes - 1)));
        sb.append("0".repeat(s.length() - countOnes)); 
        sb.append("1");

        return sb.toString();
    }
}
