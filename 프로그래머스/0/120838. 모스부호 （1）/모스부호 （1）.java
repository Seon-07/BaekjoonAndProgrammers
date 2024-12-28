class Solution {
    public String solution(String letter) {
        StringBuilder result = new StringBuilder();
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String morse : letter.split(" ")) {
            for (int i = 0; i < arr.length; i++) {
                if (morse.equals(arr[i])) {
                    result.append((char) (i + 97));
                }
            }
        }
        return result.toString();
    }
}