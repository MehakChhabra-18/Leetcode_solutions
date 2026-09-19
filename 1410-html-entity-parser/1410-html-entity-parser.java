class Solution {
    public String entityParser(String text) {
      
        HashMap<String, String> map = new HashMap<>();

        map.put("&quot;", "\"");
        map.put("&apos;", "'");
        map.put("&amp;", "&");
        map.put("&gt;", ">");
        map.put("&lt;", "<");
        map.put("&frasl;", "/");

        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < text.length()) {

            if (text.charAt(i) == '&') {

                boolean found = false;

                for (String entity : map.keySet()) {

                    if (text.startsWith(entity, i)) {
                        ans.append(map.get(entity));
                        i += entity.length();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    ans.append('&');
                    i++;
                }

            } else {
                ans.append(text.charAt(i));
                i++;
            }
        }

        return ans.toString();
        
    }
}