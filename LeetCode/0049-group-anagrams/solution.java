import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // Map banaya (key = sorted word, value = list of words)
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            
            // Step 1: sort karo
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            // Step 2: agar key pehle se nahi hai → nayi list banao
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Step 3: word add karo
            map.get(key).add(str);
        }

        // Step 4: sirf values return karo
        return new ArrayList<>(map.values());
    }
}
