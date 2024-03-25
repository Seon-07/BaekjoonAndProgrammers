class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
            String result = "";
            for(int j = 0; j < n; j++){
                String binaryNum1 = Integer.toBinaryString(arr1[i]);
                String binaryNum2 = Integer.toBinaryString(arr2[i]);
                if(binaryNum1.length() < n){
                    String zero = "";
                    for(int k = 1; k <= n-binaryNum1.length(); k++){
                        zero += "0";
                    }
                    binaryNum1 = zero + binaryNum1;
                }
                if(binaryNum2.length() < n){
                    String zero = "";
                    for(int k = 1; k <= n-binaryNum2.length(); k++){
                        zero += "0";
                    }
                    binaryNum2 = zero + binaryNum2;
                }
                String x = binaryNum1.charAt(j)+"";
                String y = binaryNum2.charAt(j)+"";
                if(x.equals("1") || y.equals("1")){
                    result += "#";
                }else{
                    result += " ";
                }
            }
            answer[i] = result;
        }
        return answer;
    }
}