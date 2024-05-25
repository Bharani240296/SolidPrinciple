import javax.swing.*;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums={2,7,9,3,1};
        System.out.println(letterCombinations("23"));
}
        public static List<String> letterCombinations(String digits) {
            if (digits.isEmpty())
                return new ArrayList<>();

            List<String> ans = new ArrayList<>();
            ans.add("");
            final String[] digitToLetters = {"",    "",    "abc",  "def", "ghi",
                    "jkl", "mno", "pqrs", "tuv", "wxyz"};

            for (final char d : digits.toCharArray()) {
                List<String> temp = new ArrayList<>();
                for (final String s : ans)
                    for (final char c : digitToLetters[d - '0'].toCharArray())
                        temp.add(s + c);
                ans = temp;
            }

            return ans;
        }
    }




