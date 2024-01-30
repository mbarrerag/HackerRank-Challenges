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
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {

        ArrayList<Integer> array = new ArrayList<>(arr);
        Integer[] numbers = new Integer[5]; // Initialize array to hold counts

        for (Integer c : array) {
            switch (c) {
                case 1:
                    numbers[0] = numbers[0] == null ? 1 : numbers[0] + 1;
                    break;
                case 2:
                    numbers[1] = numbers[1] == null ? 1 : numbers[1] + 1;
                    break;
                case 3:
                    numbers[2] = numbers[2] == null ? 1 : numbers[2] + 1;
                    break;
                case 4:
                    numbers[3] = numbers[3] == null ? 1 : numbers[3] + 1;
                    break;
                case 5:
                    numbers[4] = numbers[4] == null ? 1 : numbers[4] + 1;
                    break;
                default:
                    break; // Handle other values if needed
            }
        }

        int max = 0;
        int mostFrequent = 1; // Assuming the default is 1
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != null && numbers[i] > max) {
                max = numbers[i];
                mostFrequent = i + 1; // The index plus 1 is the bird type
            }
        }

        return mostFrequent;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
