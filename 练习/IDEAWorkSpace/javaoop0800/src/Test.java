public class Test {
    public static void main(String[] args) {
        System.out.println(Solution.convert("ABCD", 2));
    }
}

class Solution {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        String[][] out = new String[numRows][s.length() / numRows + (numRows - 1) * numRows];
        int i = 0, j = 0;
        String end = "";
        //0是直线向下模式
        //1是斜线向右上角走模式
        int mode = 0;
        for (String one : s.split("")) {
            if (i < 0 || j < 0) break;
            if (mode == 0) {
                out[i][j] = one;
                i++;
                if (i == numRows) {
                    i = i - 2;
                    j++;
                    mode = 1;
                }
            } else if (mode == 1) {
                out[i][j] = one;
                    i--;
                    j++;
                if (i == -1) {
                    i++;
                    mode = 0;
                }
            }
        }
        for (String[] i1 : out) {
            for (String j1 : i1) {
                if (j1 != null) {
                    end = end + j1;
                }
            }
        }
        return end;
    }
}
