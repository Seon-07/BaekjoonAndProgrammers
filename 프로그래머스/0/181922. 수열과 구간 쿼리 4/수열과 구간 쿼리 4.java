class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] qr : queries){
            for(int i = qr[0]; i <= qr[1]; i++){
                if(i % qr[2] == 0) arr[i]++;
            }
        }
        return arr;
    }
}