import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int count = 0;
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<spell.length; i++) {
            list.add(spell[i]);
        }
        
        for(String word: dic) {
            for(char alp: word.toCharArray()) {
                String stringAlp = String.valueOf(alp);
                for(String oneSpell: spell) {
                    if(oneSpell.equals(stringAlp)) list.remove(oneSpell);
                }
            }
            if(list.isEmpty()) return 1;
            list.clear();
                    
            for(int i=0; i<spell.length; i++) {
                list.add(spell[i]);
            }
        }
        
        return 2;
    }
}