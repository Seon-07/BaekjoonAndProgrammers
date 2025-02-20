import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        switch (n) {
            case 1 :
                return Arrays.copyOfRange(num_list, 0, slicer[1]+1);
            case 2 :
                return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
            case 3 :
                return Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
            case 4 : 
                List<Integer> resultList = new ArrayList<>();
                for(int i = slicer[0]; i <= slicer[1]; i+= slicer[2]){
                    resultList.add(num_list[i]);
                }
                return resultList.stream().mapToInt(Integer::intValue).toArray();
            default:
                return new int[0];
        }
    }
}