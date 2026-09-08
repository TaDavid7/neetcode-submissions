class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] combo = new int[26];
        int[] combo2 = new int[26];
        for(int i = 0; i<s1.length(); i++){
            int pos = s1.charAt(i) - 'a';
            int pos2 = s2.charAt(i) - 'a';
            combo[pos]++;
            combo2[pos2]++;
        }
        int matches = 0;
        for(int i = 0; i<combo.length; i++){
            if(combo[i] == combo2[i]){
                matches++;
            }
        }
        int delete = 0;
        for(int i = s1.length(); i<s2.length(); i++){
            if(matches == 26){
                return true;
            }
            int pos = s2.charAt(i) - 'a';
            combo2[pos]++;
            if(combo[pos] == combo2[pos]){
                matches++;
            } else if(combo[pos] + 1 == combo2[pos]){
                matches--;
            }
            pos = s2.charAt(delete) - 'a';
            combo2[pos]--;
             if(combo[pos] == combo2[pos]){
                matches++;
            } else if(combo[pos] - 1 == combo2[pos]){
                matches--;
            }
            delete++;

        }
        return (matches==26);
    }
}
