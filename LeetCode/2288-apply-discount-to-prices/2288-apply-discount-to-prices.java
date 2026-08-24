class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] words=sentence.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<words.length;i++)
        {   
            String word=words[i];
            if(word.matches("\\$[0-9]+"))
            {
                String num=word.substring(1);
                double price=Double.parseDouble(num);
                double discounted=price-(price*discount)/100.0;
                word=String.format("%.2f",discounted);
                word="$"+word;
            }
            ans.append(word);
            if(i != words.length - 1) {
                ans.append(" ");
            }
        }
        return ans.toString();
        
    }
}