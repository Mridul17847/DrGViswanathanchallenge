class Solution {
    public long sumAndMultiply(int n) {
        String s = "";
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit != 0) {
                s = digit + s;
            }
            temp /= 10;
        }

        if (s.equals("")) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }

        long val = Long.parseLong(s);
        return val * sum;
    }
}