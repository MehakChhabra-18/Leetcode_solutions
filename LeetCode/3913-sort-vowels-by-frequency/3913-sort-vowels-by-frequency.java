class Solution {
    public String sortVowels(String s) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u') {

                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        ArrayList<Character> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) -> {
            return map.get(b) - map.get(a);
        });

        ArrayList<Character> sortedVowels = new ArrayList<>();

        for (char c : list) {
            for (int j = 0; j < map.get(c); j++) {
                sortedVowels.add(c);
            }
        }


        StringBuilder ans = new StringBuilder();

        int i = 0;

        for (char c : s.toCharArray()) {

            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u') {

                ans.append(sortedVowels.get(i));
                i++;

            } else {
                ans.append(c);
            }
        }

        return ans.toString();
    }
}