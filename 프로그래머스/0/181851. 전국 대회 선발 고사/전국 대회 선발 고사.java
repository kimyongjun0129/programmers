import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<rank.length; i++) {
            if (attendance[i]) {
                list.add(i);
            }
        }
        
        for (int j=0; j<list.size(); j++) {
            for (int i=j+1; i<list.size(); i++) {
                if(rank[list.get(j)] > rank[list.get(i)]) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        
        return list.get(0) * 10000 + list.get(1) * 100 + list.get(2);
    }
}