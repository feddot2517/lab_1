import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t="";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (t.indexOf(s.charAt(i))==-1) t+=s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (t.charAt(i) == s.charAt(j)) count++;
            }
            System.out.println(t.charAt(i) + " " + count);
        }
    }
}
