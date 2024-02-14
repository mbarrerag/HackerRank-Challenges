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
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void countSwaps(List<Integer> a) {
        ArrayList<Integer> arrayList = new ArrayList<>(a);
        int numSwaps = 0;
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.size()-1;j++){
                if(arrayList.get(j)>arrayList.get(j+1)){
                    Integer temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j+1));
                    arrayList.set(j+1, temp);
                    numSwaps++;
                }


            }

        }
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + arrayList.get(0));
        System.out.println("Last Element: " + arrayList.get(a.size() - 1));

    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.countSwaps(a);

        bufferedReader.close();
    }
}
