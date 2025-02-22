class Solution {
    public int solution(String s) {
        int result = 0;
        String[] arr = s.split(" ");
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i].equals("Z")){
                i--;
                continue;
            }else{
                result += Integer.parseInt(arr[i]);  
            }
        }
        return result;
    }
}