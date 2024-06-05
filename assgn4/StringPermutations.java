import java.util.HashSet;
import java.util.Set;

public class StringPermutations {
    public static void main(String[] args) {
        String str = "XYZ";
        Set<String> result = new HashSet<>();
        permute(str, 0, str.length() - 1, result);
        for (String s : result) {
            System.out.println(s);
        }
    }

    
    private static void permute(String str, int left, int right, Set<String> result) {
        if (left == right) {
            result.add(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right, result);
                str = swap(str, left, i); // backtrack
            }
        }
    }

    
    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }
}
