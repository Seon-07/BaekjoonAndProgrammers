class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int i = 0; i< queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1]+1;
            String prefix = my_string.substring(0,start);
            String suffix = my_string.substring(end);
            my_string = prefix + new StringBuilder(my_string.substring(start, end)).reverse() + suffix;
        }
        return my_string;
    }
}