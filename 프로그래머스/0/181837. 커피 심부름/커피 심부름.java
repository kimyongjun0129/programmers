class Solution {
    public int solution(String[] order) {
        int sum = 0;
        
        for (String menu: order) {
            if (menu.contains("americano")) sum += 4500;
            else if (menu.contains("cafelatte")) sum += 5000;
            else if (menu.contains("anything")) sum += 4500;
        }
        
        return sum;
    }
}