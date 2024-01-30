import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        String truee = "YES";
        String falsee = "NO";

        if(s.length()%2 != 0 || s == null){
            return falsee;
        }

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length() ; i++){

            char lastEntry = s.charAt(i);

            if(lastEntry == '(' || lastEntry == '{' || lastEntry == '['){
                stack.push(lastEntry);
            } else if (lastEntry == ')' || lastEntry == '}' || lastEntry ==  ']' ) {
                if(!stack.isEmpty()){
                    char out = stack.pop();
                    if ( out == '[' && lastEntry != ']'){
                        return falsee;
                    } else if (out == '(' && lastEntry != ')'){
                        return falsee;
                    } else if (out == '{' && lastEntry != '}'){
                        return falsee;
                    }


                }
            }
        }
        if(stack.isEmpty()){
            return truee;} else {
            return falsee;
        }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
