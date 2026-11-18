class Solution {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        HashSet<String> pos=new HashSet<>();
        HashSet<String> neg=new HashSet<>();
        for(String s:positive_feedback)
        {
            pos.add(s);
        }

        for(String s:negative_feedback)
        {
            neg.add(s);
        }

        int n=report.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<report.length;i++)
        {
            String[] words=report[i].split(" ");
            int score=0;
            for(String word:words)
            {
                if(pos.contains(word))
                {
                    score+=3;
                }
                else if(neg.contains(word))
                {
                    score-=1;
                }
            }

            map.putIfAbsent(student_id[i],score);
        }


       List<Integer> ans = new ArrayList<>(map.keySet());
        Collections.sort(ans, (a, b) -> {
            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a);
            }

            return a - b;
        });

        return ans.subList(0, k);



        
    }
}