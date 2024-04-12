class Solution {
    public int[] solution(int[] array) {
        int max = 0;
        int k = 0;
        for(int i = 0; i < array.length; i++){
            max = Math.max(max,array[i]);
            if(max == array[i]){
                k = i;
            }
        }
        return new int[]{max, k};
    }
}