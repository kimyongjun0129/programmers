class Solution {
    public long solution(String numbers) {
        
        StringBuilder sb = new StringBuilder();
        long answer = 0;
        
        for(int i=0; i<numbers.length(); i++) {
            if(isNumber(sb.toString())) {
                answer = answer * 10 + whatNumber(sb.toString());
                sb.setLength(0);
                sb.append(numbers.charAt(i));
            }
            else {
                sb.append(numbers.charAt(i));
                System.out.println(sb);
            }
        }
        answer = answer * 10 + whatNumber(sb.toString());
        
        return answer;
    }
    
    public boolean isNumber(String word) {
        String[] numbers = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (String number: numbers) {
            if (word.equals(number)) {
                System.out.println(word);
                return true;
            }
        }
        return false;
    }
    
    public long whatNumber(String number) {
        switch(number) {
            case "zero": return 0;
            case "one": return 1;
            case "two": return 2;
            case "three": return 3;
            case "four": return 4;
            case "five": return 5;
            case "six": return 6;
            case "seven": return 7;
            case "eight": return 8;
            case "nine": return 9;
        }
        return 0;
    }
}