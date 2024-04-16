class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length == arr2.length){
            int k = 0;
            for(int i = 0; i < arr1.length; i++){
                k += arr1[i];
                k -= arr2[i];
            }
            return k == 0 ? 0 : (k > 0 ? 1 : -1);
        }else{
            return arr1.length > arr2.length ? 1 : -1;
        }
    }
}