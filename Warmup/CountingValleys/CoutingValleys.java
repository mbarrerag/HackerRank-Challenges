
class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int altitude = 0; // Current altitude
        int valleys = 0; // Number of valleys traversed

        for (char step : path.toCharArray()) {
            if (step == 'U') {
                altitude++; // Step up
                if (altitude == 0) {
                    valleys++; // Reached sea level after a valley
                }
            } else {
                altitude--; // Step down
            }
        }
        return valleys;

    }
}