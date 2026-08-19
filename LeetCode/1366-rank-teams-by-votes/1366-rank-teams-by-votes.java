import java.util.*;

class Solution {
    public String rankTeams(String[] votes) {

        int n = votes[0].length();
        HashMap<Character, int[]> map = new HashMap<>();
        for (char team : votes[0].toCharArray()) {
            map.put(team, new int[n]);
        }
        for (String vote : votes) {
            for (int i = 0; i < n; i++) {
                char team = vote.charAt(i);
                map.get(team)[i]++;
            }
        }

        List<Character> teams = new ArrayList<>(map.keySet());
        Collections.sort(teams, (a, b) -> {

            int[] A = map.get(a);
            int[] B = map.get(b);
            for (int i = 0; i < n; i++) {
                if (A[i] != B[i]) {
                    return B[i] - A[i];
                }
            }
            return a - b;
        });

        StringBuilder ans = new StringBuilder();

        for (char team : teams) {
            ans.append(team);
        }

        return ans.toString();
    }
}