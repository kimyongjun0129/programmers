import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> nameToIdx = new HashMap<>(players.length);
        for (int i = 0; i < players.length; i++) {
            nameToIdx.put(players[i], i);
        }
        
        
        for(String calling: callings) {
            int index = nameToIdx.get(calling);
            String front = players[index-1];
            players[index-1] = players[index];
            players[index] = front;
            
            nameToIdx.put(front, index);
            nameToIdx.put(calling, index-1);
        }
        return players;
    }
}