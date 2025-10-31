class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0;
        int j = 0;
        for(String word : goal){
            if(cards1.length-1 >= i && cards1[i].equals(word)){
                i++;
                continue;
            }
            if(cards2.length-1 >= j && cards2[j].equals(word)){
                j++;
                continue;
            }
            return "No";
        }
        return "Yes";
    }
}