class Solution {
    public int solution(int[] num_list) {
        int cnt = 0;
        for(int i : num_list){
            while(i != 1){
                if(i % 2 == 0){
                    i /= 2;       
                }else{
                    i -= 1;
                    i /= 2;
                }
                cnt++;
            }
        }
        return cnt;
    }
}