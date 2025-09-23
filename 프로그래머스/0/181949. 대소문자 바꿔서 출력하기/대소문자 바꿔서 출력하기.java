import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String a = sc.next();
        for (char alphabet: a.toCharArray()) {
            if (alphabet - 'A' < 24) sb.append((char)(alphabet - 'A' + 'a'));
            else sb.append((char)(alphabet - 'a' + 'A'));
        }
        System.out.println(sb);
    }
}