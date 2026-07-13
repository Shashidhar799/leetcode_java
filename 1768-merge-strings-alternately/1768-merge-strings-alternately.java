class Solution {
    public String mergeAlternately(String word1, String word2) {
        int first = 0;
        StringBuilder sb = new StringBuilder();

        while(first<word1.length() && first<word2.length()){
            sb.append(word1.charAt(first));
            sb.append(word2.charAt(first));

            first++;
        }

        while(first<word1.length()){
            sb.append(word1.charAt(first));
            first++;
        }

        while(first<word2.length()){
            sb.append(word2.charAt(first));
            first++;
        }
        return sb.toString();
    }
}