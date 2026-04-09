class Solution {
    public String decodeString(String s) {
        Stack<String> str = new Stack<>();
        Stack<Integer> number = new Stack<>();
       
        
        int num = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                number.push(num);
                num = 0;
                str.push("[");
               
            } else if (Character.isLetter(c)) {
                str.push(c + "");
            } else {
                StringBuilder temp = new StringBuilder();
                while (!str.isEmpty() && !str.peek().equals("[")) {
                    temp.insert(0,str.pop());
                }
                str.pop();
                int val = number.pop();
               StringBuilder ans = new StringBuilder();
                for (int i = 0; i < val; i++) {
                    ans.append(temp);
                }
                for (char ch : ans.toString().toCharArray()) {
                    str.push(ch + "");
                }
            }
        }

        StringBuilder finl = new StringBuilder();
        while (!str.isEmpty()) {
            finl.insert(0, str.pop());
        }
        return finl.toString();

    }
}
