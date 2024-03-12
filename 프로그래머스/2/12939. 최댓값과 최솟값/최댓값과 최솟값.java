import java.util.*;
class Solution {
    public String solution(String s) {
        List<Integer> sList = new ArrayList<>();
        String[] sArr = s.split(" ");
        for(String i : sArr){
            sList.add(Integer.parseInt(i));
        }
        sList.sort(null);
        return sList.get(0)+" "+sList.get(sList.size()-1);
    }
}