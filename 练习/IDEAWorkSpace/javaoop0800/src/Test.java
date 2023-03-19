public class Test {
    public static void main(String[] args) {
        System.out.println(Solution.convert("Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers.", 3));
    }
}

class Solution {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        char[][] out = new char[numRows][s.length() / numRows + numRows * numRows + 99];
        int i = 0, j = 0;
        int mode = 0;
        for (String one : s.split("")) {
            if (i < 0) {
                i = 0;
            }
            if (mode == 0) {
                try {
                    out[i][j] = one.charAt(0);
                } catch (Exception e) {
                    System.out.println(i + "" + j);
                }
                i++;
                if (i == numRows) {
                    i = i - 2;
                    j++;
                    mode = 1;
                }
            } else if (mode == 1) {
                try {
                    out[i][j] = one.charAt(0);
                } catch (Exception e) {
                    System.out.println(i + "" + j);
                }
                if (i == 0) {
                    i++;
                    mode = 0;
                } else {
                    j++;
                    i--;
                }
            }
        }
        String end = "";
        for (char[] i1 : out) {
            for (char j1 : i1) {
                if (j1 != '\u0000') {
                    end = end + j1;
                }
            }
        }
        return end;
    }
}
