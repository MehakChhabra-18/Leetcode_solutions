class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<>();
       String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       Queue<String> q=new LinkedList<>();
       q.add("");
       for(char d:digits.toCharArray())
       {
          String letters=map[d-'0'];
          int size=q.size();
          for(int i=0;i<size;i++)
          {
            String curr=q.poll();
            for(char ch:letters.toCharArray())
            {
                q.add(curr+ch);
            }
          }
       }
       return new ArrayList<>(q);
        
    }
}
