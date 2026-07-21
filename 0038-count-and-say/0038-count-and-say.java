class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for(int i = 1;i<n;i++){
            String ans = "";
            int count = 1;
            for(int j = 1;j<=s.length();j++){
                if(j<s.length() && s.charAt(j) == s.charAt(j-1)){
                    count ++;
                } else {
                    ans+=count;
                    ans+= s.charAt(j-1);
                    count = 1;
                }
            }
            s=ans;
        }
        return s;
    }
}