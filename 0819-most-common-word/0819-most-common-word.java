class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> bannedWords = new HashSet<>();
        for (String word : banned) {
            bannedWords.add(word);
        }

        Map<String, Integer> map = new HashMap<>();

        paragraph = paragraph.toLowerCase();
        String[] words = paragraph.split("[^a-z]+");

        String answer = "";
        int max = 0;

        for (String word : words) {
            if (word.length() == 0 || bannedWords.contains(word)) {
                continue;
            }

            map.put(word, map.getOrDefault(word, 0) + 1);

            if (map.get(word) > max) {
                max = map.get(word);
                answer = word;
            }
        }

        return answer;
    }
}