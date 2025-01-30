class Solution {
    public int solution(int[][] dots) {
        int[] arr = {dots[0][0], dots[0][1], dots[0][0], dots[0][1]};
        for(int[] dot : dots){
            if(arr[0] > dot[0]) arr[0] = dot[0];
            if(arr[1] > dot[1]) arr[1] = dot[1];
            if(arr[2] < dot[0]) arr[2] = dot[0];
            if(arr[3] < dot[1]) arr[3] = dot[1];
        }
        return Math.abs((arr[2] - arr[0]) * (arr[3] - arr[1]));
    }
}