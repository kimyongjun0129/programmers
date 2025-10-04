class Solution {
    public String solution(String[] id_pw, String[][] db) {
        
        for(String[] account: db) {
            if (id_pw[0].equals(account[0]) && !id_pw[1].equals(account[1])) return "wrong pw";
            else if(id_pw[0].equals(account[0]) && id_pw[1].equals(account[1])) return "login";
        }

        return "fail";
    }
}