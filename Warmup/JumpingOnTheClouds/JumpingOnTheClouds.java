class Result {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {

        int jumps = 0;
        int cloud = 0;

        while(cloud < c.size()-1 ){
            if(cloud+2 < c.size() && c.get(cloud+2) == 0){
                cloud +=2;
            }else {
                cloud++;
            }
            jumps++;
        }
        return jumps;
    }

}
