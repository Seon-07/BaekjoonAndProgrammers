import java.util.*;
class Solution {
    public String[] solution(String str) {
        String[] arr = str.split("x");
        List<String> filteredList = new ArrayList<>();
        for (String s : arr) {
            if (!s.isEmpty()) {
                filteredList.add(s);
            }
        }
        String[] filteredArr = filteredList.toArray(new String[0]);
        Arrays.sort(filteredArr);
        return filteredArr;
    }
}