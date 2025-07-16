import java.util.ArrayList;
import java.util.List;

class Solution {

    public String encode(List<String> strs) {
        StringBuilder enc = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            enc.append(strs.get(i).length()).append("/").append(strs.get(i));
        }
        return enc.toString();
    }

    //Decode:
    //While loop
    //First find slash using indexOf(‘/’, start point)
    //Find length using Integer.parseInt(str.substring(i, slash))
    //Make sure to increment index (i) to the end of the string not just i++

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i = 0;
            while (i < str.length()) {
                int slash = str.indexOf('/', i);
                int length = Integer.parseInt(str.substring(i, slash));
                String newstr = new String();
                newstr = str.substring(slash + 1, slash + length + 1);
                strs.add(newstr);
                i = slash + length + 1;
            }
        return strs;
    }
}
