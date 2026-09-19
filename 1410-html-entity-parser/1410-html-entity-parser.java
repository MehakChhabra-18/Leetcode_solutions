class Solution {
    public String entityParser(String text) {
        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < text.length()) {

            if (text.startsWith("&quot;", i)) {
                ans.append("\"");
                i += 6;
            }
            else if (text.startsWith("&apos;", i)) {
                ans.append("'");
                i += 6;
            }
            else if (text.startsWith("&amp;", i)) {
                ans.append("&");
                i += 5;
            }
            else if (text.startsWith("&gt;", i)) {
                ans.append(">");
                i += 4;
            }
            else if (text.startsWith("&lt;", i)) {
                ans.append("<");
                i += 4;
            }
            else if (text.startsWith("&frasl;", i)) {
                ans.append("/");
                i += 7;
            }
            else {
                ans.append(text.charAt(i));
                i++;
            }
        }

        return ans.toString();
        
    }
}