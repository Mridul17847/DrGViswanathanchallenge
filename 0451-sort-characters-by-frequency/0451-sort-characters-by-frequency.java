class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        StringBuilder ans = new StringBuilder();
        while(!map.isEmpty()){
            char maxCh = ' ';
            int maxFre = 0;
            for(char ch : map.keySet()){
                if(map.get(ch) > maxFre){
                    maxFre= map.get(ch);
                    maxCh = ch;
                }
            }
            for(int i = 0;i<maxFre;i++){
                ans.append(maxCh);
            }
            map.remove(maxCh);
        }
        return ans.toString();
    }
}