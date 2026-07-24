class Solution {
    public String multiplyStrings(String s1, String s2) {

        boolean negative = false;

        if (s1.charAt(0) == '-') {
            negative = !negative;
            s1 = s1.substring(1);
        }

        if (s2.charAt(0) == '-') {
            negative = !negative;
            s2 = s2.substring(1);
        }

        s1 = s1.replaceFirst("^0+", "");
        s2 = s2.replaceFirst("^0+", "");

   
        if (s1.length() == 0 || s2.length() == 0)
            return "0";

        int n = s1.length();
        int m = s2.length();

        int[] result = new int[n + m];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                int mul = (s1.charAt(i) - '0') * (s2.charAt(j) - '0');

                int p1 = i + j;
                int p2 = i + j + 1;

                int sum = mul + result[p2];

                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }

  
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < result.length && result[i] == 0)
            i++;

        while (i < result.length) {
            sb.append(result[i]);
            i++;
        }

        if (negative)
            sb.insert(0, '-');

        return sb.toString();
    }
}